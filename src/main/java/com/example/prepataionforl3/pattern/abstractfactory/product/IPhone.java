package com.example.prepataionforl3.pattern.abstractfactory.product;

public class IPhone implements Phone{
    @Override
    public void doCall() {
        System.out.println("Apple user on the line");
    }
}
