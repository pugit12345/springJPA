package com.spring_jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.SortedSet;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
 public class Test1 {


    public Test1(String str){
        System.out.println("--------------Created a new object  " + str);
    }

}
