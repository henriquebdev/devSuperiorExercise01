package com.ex1ComponenteInjecaoDependencia.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Order {

    private Integer code;
    private Double basic;
    private Double discount;


    
}
