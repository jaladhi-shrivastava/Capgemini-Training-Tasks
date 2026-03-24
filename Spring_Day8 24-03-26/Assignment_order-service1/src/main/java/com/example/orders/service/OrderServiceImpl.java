package com.example.orders.service;

import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.entity.OrderEntity;
import com.example.orders.exception.OrderNotFoundException;
import com.example.orders.mapper.OrderMapper;
import com.example.orders.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public OrderEntity createOrder(OrderRequestDTO request) {
        OrderEntity order = new OrderEntity();
        order.setCustomerName(request.getCustomerName());
        order.setEmail(request.getEmail());
        order.setProductName(request.getProductName());
        order.setQuantity(request.getQuantity());
        order.setPricePerUnit(request.getPricePerUnit());
        order.setTotalAmount(request.getPricePerUnit() * request.getQuantity());

        return orderRepository.save(order);
    }

    @Override
    public OrderEntity getOrderById(Long id) {
        Optional<OrderEntity> orderEntity = orderRepository.findById(id);
        if(orderEntity.isPresent()) {
            return orderEntity.get();
        }else{
            throw new OrderNotFoundException();
        }
    }

    @Override
    public void deleteOrder(Long id) {
        if(!orderRepository.existsById(id)) {
            throw new OrderNotFoundException();
        }
        orderRepository.deleteById(id);
        
    }
}
