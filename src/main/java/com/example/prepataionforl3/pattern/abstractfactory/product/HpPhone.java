package com.example.prepataionforl3.pattern.abstractfactory.product;

public class HpPhone implements Phone{
    @Override
    public void doCall() {
        System.out.println("HP user on the line");
    }
}
