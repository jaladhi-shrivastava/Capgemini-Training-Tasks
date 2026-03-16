package com.cg.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class TestCar {
    static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
       Car car = (Car) context.getBean("car");
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter EngineType (Petrol or CNG): ");
//        String engineType=sc.next();
//        System.out.println("Enter Tyre Choice (MRF or JK): ");
//        String tyreChoice=sc.next();
//
//        IEngine e= (IEngine) context.getBean(engineType.toLowerCase());
//        ITyre tyre= (ITyre) context.getBean(tyreChoice.toLowerCase());
//        car.setEngine(e);
//        car.setTyre(tyre);
//        car.setName("Alto");
        car.printCar();
    }
}
