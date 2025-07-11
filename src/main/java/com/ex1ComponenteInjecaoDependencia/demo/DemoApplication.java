package com.ex1ComponenteInjecaoDependencia.demo;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ex1ComponenteInjecaoDependencia.demo.services.OrderService;
import com.ex1ComponenteInjecaoDependencia.demo.entity.Order;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

public void run (String... args) throws Exception{
	Order order = new Order(1034,150.00,20.0);
	System.out.println("Pedido código "+order.getCode()+"\nValor total: R$ " + String.format(Locale.US,"%.2f", orderService.total(order)));
	

}

}
