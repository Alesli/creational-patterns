package com.example.prepataionforl3.pattern.builder;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder().setModel("Audi").setId(1).setMaxSpeed(300).setWheels(4).build();

        System.out.println(car);
    }
}
