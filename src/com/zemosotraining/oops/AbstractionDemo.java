package com.zemosotraining.oops;

// Abstraction using Interface Car
interface Car {

    void turnOnCar();

    void turnOffCar();

    String getCarType();
}

class ManualCar implements Car {

    private final String carType = "Manual";

    @Override
    public void turnOnCar() {
        System.out.println("starting the car manually");
    }

    @Override
    public void turnOffCar() {
        System.out.println("turning off the car manually");
    }

    @Override
    public String getCarType() {
        return carType;
    }
}

class AutomaticCar implements Car {

    private final String carType = "Automatic";
    private char shifterDirection;

    public void driveBackward() {
        shifterDirection = 'R';
        System.out.println("Driving the car in reverse direction");
    }

    public void driveForward() {
        shifterDirection = 'D';
        System.out.println("Driving the car in forward direction");
    }

    @Override
    public void turnOnCar() {
        System.out.println("starting the Automatic car with start button");
    }

    @Override
    public void turnOffCar() {
        System.out.println("turning off the Automatic car");
    }

    @Override
    public String getCarType() {
        return carType;
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        System.out.println("------------- Manual ------------------------");
        ManualCar manCar = new ManualCar();
        manCar.turnOnCar();
        manCar.turnOffCar();
        System.out.println("Type of the car : " + manCar.getCarType());

        System.out.println("------------- Automatic ----------------------------");
        AutomaticCar autoCar = new AutomaticCar();
        autoCar.turnOnCar();
        autoCar.turnOffCar();
        System.out.println("Type of the car : " + autoCar.getCarType());
        autoCar.driveBackward();
        autoCar.driveForward();

        System.out.println("------------- Abstraction achieved through abstract class----------------------");
        MyHomeCar myCar = new MyHomeCar();
        myCar.turnOnCar();
        myCar.turnOffCar();
        myCar.driveForward();

        //instantiating Interface with Anonymous inner class by providing all the implementations
        Car c = new Car() {
            @Override
            public void turnOnCar() {

            }

            @Override
            public void turnOffCar() {

            }

            @Override
            public String getCarType() {
                return null;
            }
        };
    }
}

// Abstraction achieved through abstract class
abstract class MyCar {
    abstract void turnOnCar();

    abstract void turnOffCar();

    abstract String getCarType();

    public void driveForward() {
        System.out.println("DRiving the car in forward direction");
    }
}

class MyHomeCar extends MyCar {

    private final String carType = "Automatic";

    @Override
    public void turnOnCar() {
        System.out.println("starting the MyHome car with start button");
    }

    @Override
    public void turnOffCar() {
        System.out.println("turning off the MyHome car");
    }

    @Override
    public String getCarType() {
        return carType;
    }
}
