package com.zemosotraining.oops;

class Vehicle{
    public void start(){
        System.out.println("Vehicle is starting....");
    }
}

class Bike extends Vehicle{
    @Override
    public void start() {
        System.out.println("Hey, I'm overridden - Bike : subclass is starting...");
    }
}
public class MethodOverridingDemo {
    public static void main(String[] args) {
        //Parent ref - Parent obj
        Vehicle veh = new Vehicle();
        veh.start();

        //Child ref - Child obj
        Bike bike = new Bike();
        bike.start();

        //Parent ref - Child obj
        Vehicle bikeObj = new Bike();
        bikeObj.start();

        // Dynamic Method dispatch
        Vehicle v;
        v = new Bike();
        v.start();
        v = new Vehicle();
        v.start();

        // Child ref - Parent Obj
  //      Bike vehObj = new Vehicle();
    }
}
