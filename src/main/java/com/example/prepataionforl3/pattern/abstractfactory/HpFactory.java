package com.example.prepataionforl3.pattern.abstractfactory;

import com.example.prepataionforl3.pattern.abstractfactory.product.*;

public class HpFactory extends CompanyAbstractFactory{
    @Override
    public Phone createPhone() {
        return new HpPhone();
    }

    @Override
    public TV createTV() {
        return new HpTV();
    }

    @Override
    public Laptop createLaptop() {
        return new HpLaptop();
    }
}
