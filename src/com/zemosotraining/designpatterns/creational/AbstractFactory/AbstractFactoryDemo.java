package com.zemosotraining.designpatterns.creational.AbstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactoryType = FactoryGenerator.getFactory("normal");
        Shape shape1 = shapeFactoryType.getShape("Triangle");
        shape1.drawShape();
        Shape shape2 = shapeFactoryType.getShape("Rectangle");
        shape2.drawShape();

        AbstractFactory shapeFactoryTypeR = FactoryGenerator.getFactory("rounded");
        Shape shape3 = shapeFactoryTypeR.getShape("Triangle");
        shape3.drawShape();
        Shape shape4 = shapeFactoryTypeR.getShape("Rectangle");
        shape4.drawShape();

    }
}
