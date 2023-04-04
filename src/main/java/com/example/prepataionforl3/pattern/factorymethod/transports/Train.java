package com.example.prepataionforl3.pattern.factorymethod.transports;

public class Train extends Transport{
    @Override
    public void delivery() {
        System.out.println("Train is delivering a product");
    }
}
