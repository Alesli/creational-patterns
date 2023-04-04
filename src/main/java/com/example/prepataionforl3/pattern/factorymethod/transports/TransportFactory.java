package com.example.prepataionforl3.pattern.factorymethod.transports;

public abstract class TransportFactory {
    public static Transport getTransport(String type){
        return switch (type) {
            case "train" -> new Train();
            case "car" -> new Car();
            default -> throw new RuntimeException();
        };
    }
}
