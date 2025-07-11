package com.ex1ComponenteInjecaoDependencia.demo.services;


import org.springframework.stereotype.Service;

import com.ex1ComponenteInjecaoDependencia.demo.entity.Order;

@Service
public class ShippingService {

    Double shipment (Order order){

        double percentageDiscount = (order.getDiscount()/100.0)*order.getBasic();
        double basicValueWithDiscount = order.getBasic() - percentageDiscount;
        if(basicValueWithDiscount < 100.0){
            basicValueWithDiscount+= 20.0;
        }else if(basicValueWithDiscount >= 100.0 && basicValueWithDiscount <= 200.0){
            basicValueWithDiscount+= 12.0;
        }else{
            basicValueWithDiscount+= 0.0;
        }

        return basicValueWithDiscount;
    }

    
}
