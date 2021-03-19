package com.zemosotraining.designpatterns.creational.AbstractFactory;

public interface Shape {
    void drawShape();
}

// concrete classes implements Shape
class Rectangle implements Shape {

    @Override
    public void drawShape() {
        System.out.println("Normal Rectangle - drawing a rectangle");
    }
}

class Triangle implements Shape {

    @Override
    public void drawShape() {
        System.out.println("Normal Triangle - drawing Triangle");
    }
}

class RoundedRectangle implements Shape {

    @Override
    public void drawShape() {
        System.out.println("RoundedRectangle - drawing a rectangle with rounded corners");
    }
}

class RoundedTriangle implements Shape {

    @Override
    public void drawShape() {
        System.out.println("RoundedTriangle - drawing Triangle with rounded corners");
    }
}