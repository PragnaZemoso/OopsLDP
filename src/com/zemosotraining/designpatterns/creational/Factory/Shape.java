package com.zemosotraining.designpatterns.creational.Factory;

public interface Shape {
    void drawShape();
}

class Circle implements Shape {

    @Override
    public void drawShape() {
        System.out.println("Circle - drawing a circle");
    }
}

class Triangle implements Shape {

    @Override
    public void drawShape() {
        System.out.println("Triangle - drawing Triangle");
    }
}