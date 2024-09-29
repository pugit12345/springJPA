package com.spring_jpa.controller;


import org.springframework.stereotype.Component;

@Component
@org.springframework.context.annotation.Lazy
public class Lazy {
    public  Lazy(String str){
        System.out.println("I am lazy guy." + str);
    }
}
