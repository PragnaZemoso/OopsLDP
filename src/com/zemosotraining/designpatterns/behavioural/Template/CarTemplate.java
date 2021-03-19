package com.zemosotraining.designpatterns.behavioural.Template;

/**
 * Defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
 * Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithms structure.
 */
public abstract class CarTemplate {
    protected String chassis;
    protected String body;
    protected String paintColor;
    protected String interior;

    /**
     * making the template method final to prevent subclasses from overriding it.
     *
     * @param paintColor
     */
    public final void manufactureCar(String paintColor) {
        fixChassis(); //It includes wheels, brakes, suspension systems, axles, engine, etc.
        fixBody();
        hook(); // allow subclasses with additional extension points for the algorithm.
        paint(paintColor);
        fixInterior();
    }

    // default implementation
    void paint(String color) {
        System.out.println("Painting body of the car with Color " + color);
        this.paintColor = color;
    }

    //abstract steps
    protected abstract void fixChassis();

    protected abstract void fixBody();

    protected abstract void fixInterior();

    protected void hook() {
        // Optional step with empty body
    }

    @Override
    public String toString() {
        return "CarTemplate{" +
                "chassis='" + chassis + '\'' +
                ", body='" + body + '\'' +
                ", paintColor='" + paintColor + '\'' +
                ", interior='" + interior + '\'' +
                '}';
    }
}
