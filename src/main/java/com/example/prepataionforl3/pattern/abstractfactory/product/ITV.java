package com.example.prepataionforl3.pattern.abstractfactory.product;

public class ITV implements TV{
    @Override
    public void doWatch() {
        System.out.println("ITV is showing Ted Lasso");
    }
}
