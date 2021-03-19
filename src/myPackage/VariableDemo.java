package myPackage;

/*
Types of Variables:
1. Instance variables
2. local variables
3. static variables
 */

class TableFan {
    public boolean isOn; //Instance variable
    public static int fanSpeed = 2; // static variable

    // non-parameterized constructor
    TableFan(){
        this.isOn = true;
    }

    public void switchOn() {
        isOn = true;
        boolean spinner = true; // Local variable
        System.out.println("Fan state is - " + isOn + " , its spinning and spinner - " + spinner);
    }

    public void switchOff() {
        isOn = false;
        //   spinner = false; // cannot resolve symbol 'spinner' as local var defined in switchOn() is not visible here
        System.out.println("Fan state is - " + isOn + " , its stopped");
    }

    // static method
    public static int getFanSpeed(){
        return fanSpeed;
    }
}

public class VariableDemo {
    public static void main(String[] args) {
        //Instance variable methods
        TableFan fan = new TableFan();
        fan.switchOn();
        fan.switchOff();
        TableFan.fanSpeed = 5; // direct access w.r.t Class name
        System.out.println("Speed of TableFan: " + TableFan.fanSpeed); // static method call
    }
}
