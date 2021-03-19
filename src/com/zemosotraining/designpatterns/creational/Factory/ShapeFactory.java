package com.zemosotraining.designpatterns.creational.Factory;

// Factory to generate objects of concrete classes
public class ShapeFactory {

    public Shape getShape(String shapeName) {

        if (shapeName.equals("Circle")) {
            return new Circle();
        } else if (shapeName.equals("Triangle")) {
            return new Triangle();
        }
        return null;
    }

}

