package com.ex1ComponenteInjecaoDependencia.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex1ComponenteInjecaoDependencia.demo.entity.Order;

@Service
public class OrderService {

    @Autowired
    ShippingService shippingService;

        public double total(Order order){
        return shippingService.shipment(order);
    }
    
}
