package com.example.prepataionforl3.pattern.abstractfactory.product;

public class MacBook implements Laptop{
    @Override
    public void openIde() {
        System.out.println("IDE opened very fast, WOW");
    }
}
