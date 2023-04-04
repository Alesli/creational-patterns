package com.example.prepataionforl3.pattern.factorymethod.transports;

public class Main {
    public static void main(String[] args) {
        TransportFactory.getTransport("car").delivery();
        TransportFactory.getTransport("train").delivery();
    }
}
