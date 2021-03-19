package com.zemosotraining.designprinciples.dry.solution;

// DRY & SLAP
class MechanicShop{
    private String cleanser;

    public void serviceBike(){ // Composed Method
        performCleaning(); //Extract method
        System.out.println("servicing bike...");
        performPolishing();
    }
    public void serviceCar(){
        performCleaning();
        System.out.println("Servicing Car...");
        performPolishing();
    }

    // common repetitive tasks
    public void performCleaning(){
        System.out.println("performing cleaning activities...");
        //code for Cleaning activities
    }

    public void performPolishing(){
        System.out.println("Polishing the vehicle....");
        // code for polishing activities
    }
}

public class Solution {
    public static void main(String[] args) {
        MechanicShop bike = new MechanicShop();
        bike.serviceBike();

        MechanicShop car = new MechanicShop();
        car.serviceCar();
    }


}
