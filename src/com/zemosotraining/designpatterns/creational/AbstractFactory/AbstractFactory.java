package com.zemosotraining.designpatterns.creational.AbstractFactory;

public abstract class AbstractFactory {
    abstract Shape getShape(String shapeName);
}


class NormalShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shapeName) {
        if (shapeName.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeName.equalsIgnoreCase("Triangle")) {
            return new Triangle();
        }
        return null;
    }
}

class RoundedShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shapeName) {
        if (shapeName.equalsIgnoreCase("RECTANGLE")) {
            return new RoundedRectangle();
        } else if (shapeName.equalsIgnoreCase("Triangle")) {
            return new RoundedTriangle();
        }
        return null;
    }
}

