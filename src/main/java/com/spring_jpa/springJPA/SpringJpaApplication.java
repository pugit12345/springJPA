package com.spring_jpa.springJPA;

import com.spring_jpa.controller.Test1;
import com.spring_jpa.controller.Lazy;

import com.spring_jpa.pizza.pizza;
import com.spring_jpa.pizza.vegPizza;
import com.spring_jpa.springJPA.entity.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication(scanBasePackages = "com.spring_jpa")
public class SpringJpaApplication {

	public static void main(String[] args) {
		System.out.println("hello prakash");
		ConfigurableApplicationContext context  =
				SpringApplication.run(SpringJpaApplication.class, args);
		System.out.println("hello prakash111");

		String names[] = context.getBeanDefinitionNames();

		for(String name : names)
		{
			System.out.println(" bean name "+name);
		}

		Product t1 = context.getBean(Product.class);
		System.out.println(t1.toString());

	Test1 t2 = context.getBean(Test1.class,"prakash");

	pizza p = context.getBean(vegPizza.class);
	vegPizza vp =(vegPizza) p;

		System.out.println(p.getPizza());
		System.out.println(vp.testVar);


		Lazy l = context.getBean(Lazy.class, "PKU");

	}

}
