package com.spring_jpa.springJPA.entity;

import org.springframework.stereotype.Component;

@Component
public class Product {
    public Product()
    {
        System.out.println(("------------product"));
    }

  public String toString()
    {
        return "product ";
    }
}
