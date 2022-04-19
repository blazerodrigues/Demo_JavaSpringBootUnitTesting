package com.demo.calculator;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@Component
public class Calculator {

    //sum
    public int doSum(int a, int b, int c){
        return a+b+c;
    }

    //product
    public int doProduct(int a, int b){
        return a*b;
    }

    //compare
    public Boolean compareTwoNums(int a, int b){
        return a==b;
    }

}
