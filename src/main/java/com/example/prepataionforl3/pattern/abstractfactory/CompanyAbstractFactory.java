package com.example.prepataionforl3.pattern.abstractfactory;

import com.example.prepataionforl3.pattern.abstractfactory.product.Laptop;
import com.example.prepataionforl3.pattern.abstractfactory.product.Phone;
import com.example.prepataionforl3.pattern.abstractfactory.product.TV;

/**
 * AbstractFactory is used to union entities by some type e.g. Company, Furniture, Car models etc.
 */
public abstract class CompanyAbstractFactory {
    public abstract Phone createPhone();
    public abstract TV createTV();
    public abstract Laptop createLaptop();
}
