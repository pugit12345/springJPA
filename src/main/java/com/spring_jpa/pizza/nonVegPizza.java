package com.spring_jpa.pizza;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class nonVegPizza  implements  pizza {
    public String getPizza()
    {
        return "non veg pizza";
    }
}
