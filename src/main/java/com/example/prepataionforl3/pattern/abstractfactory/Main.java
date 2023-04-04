package com.example.prepataionforl3.pattern.abstractfactory;



public class Main {
    public static void main(String[] args) {
        // I wish to get all Apple devices to feel their Ecosystem
        CompanyAbstractFactory factory = new AppleFactory();
        factory.createPhone().doCall();
        factory.createLaptop().openIde();
        factory.createTV().doWatch();

        // I'm working...
        CompanyAbstractFactory workingFactory = new HpFactory();
        workingFactory.createPhone().doCall();
        workingFactory.createTV().doWatch();
        workingFactory.createLaptop().openIde();
    }
}
