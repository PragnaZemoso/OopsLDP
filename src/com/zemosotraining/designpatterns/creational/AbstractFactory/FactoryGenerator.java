package com.zemosotraining.designpatterns.creational.AbstractFactory;

public class FactoryGenerator {
    static AbstractFactory getFactory(String factoryType) {
        if (factoryType.equalsIgnoreCase("ROUNDED"))
            return new RoundedShapeFactory();
        else
            return new NormalShapeFactory();
    }
}
