package myPackage;

// Simple Class Object demo

class Fan {
    private boolean isOn;

    public void switchOn() {
        isOn = true;
        System.out.println("Fan state is - " + isOn + " , its spinning");
    }

    public void switchOff() {
        isOn = false;
        System.out.println("Fan state is - " + isOn + " , its stopped");
    }
}

public class MyClass {
    public static void main(String[] args) {
        Fan myFan = new Fan();
        myFan.switchOn();
        myFan.switchOff();
    }
}
