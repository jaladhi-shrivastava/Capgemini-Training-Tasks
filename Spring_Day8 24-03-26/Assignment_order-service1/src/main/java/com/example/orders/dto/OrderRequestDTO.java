package com.example.orders.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderRequestDTO {
    @Size(min=3)
    @NotNull
    @NotBlank
    private String customerName;
    @Email
    @NotBlank
    @NotNull
    private String email;
    @NotNull
    @NotBlank
    private String productName;
    @Min(value=1)
    private Integer quantity;
    @Min(value = 1)
    @DecimalMin(value="0.01")
    private Double pricePerUnit;

    public OrderRequestDTO(){}
    public OrderRequestDTO(String customerName, String email, String productName, Integer quantity, Double pricePerUnit) {
        this.customerName = customerName;
        this.email = email;
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

}
