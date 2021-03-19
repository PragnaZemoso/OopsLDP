package com.zemosotraining.designpatterns.behavioural.Template;

public class DriverClass {
    public static void main(String[] args) {
        CarTemplate car = new ClassicCar();
        car.manufactureCar("White");
        System.out.println("Car manufactured is: ----------\n" + car);
        System.out.println("#####################################################");
        car = new SportsCar();
        car.manufactureCar("Shiny Torch Red");
        System.out.println("Car manufactured is: ----------\n" + car);
    }
}
