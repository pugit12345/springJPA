package com.spring_jpa.pizza;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class vegPizza implements pizza{
       @Value("${prakash.test}")
    public String testVar;

    public String getPizza()
    {
        return "Veg Pizza";
    }
}
