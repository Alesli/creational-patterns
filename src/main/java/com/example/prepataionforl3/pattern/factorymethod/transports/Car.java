package com.example.prepataionforl3.pattern.factorymethod.transports;

public class Car extends Transport{
    @Override
    public void delivery() {
        System.out.println("Car is delivering a product");
    }
}
