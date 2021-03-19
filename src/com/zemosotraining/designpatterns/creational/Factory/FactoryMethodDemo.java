package com.zemosotraining.designpatterns.creational.Factory;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.drawShape();

        Shape shape2 = shapeFactory.getShape("Triangle");
        shape2.drawShape();
    }
}
