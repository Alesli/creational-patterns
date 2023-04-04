package com.example.prepataionforl3.pattern.abstractfactory;

import com.example.prepataionforl3.pattern.abstractfactory.product.*;

public class AppleFactory extends CompanyAbstractFactory{
    @Override
    public Phone createPhone() {
        return new IPhone();
    }

    @Override
    public TV createTV() {
        return new ITV();
    }

    @Override
    public Laptop createLaptop() {
        return new MacBook();
    }
}
