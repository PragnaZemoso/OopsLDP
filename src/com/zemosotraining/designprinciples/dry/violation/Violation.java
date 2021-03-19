package com.zemosotraining.designprinciples.dry.violation;

class MechanicShop{

    public void serviceBike(){
        //code for Cleaning activities
        System.out.println("servicing bike...");
        //code for polishing activities
    }
    public void serviceCar(){
        //code for Cleaning activities
        System.out.println("Servicing Car...");
        // code for polishing activities
    }
}
public class Violation {
    public static void main(String[] args) {
        MechanicShop bike = new MechanicShop();
        bike.serviceBike();

        MechanicShop car = new MechanicShop();
        car.serviceCar();
    }
}
