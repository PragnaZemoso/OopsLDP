package com.zemosotraining.accessmodifiers;

public class TestDefault {
    public static void main(String[] args) {
        DefaultDemo defDemo = new DefaultDemo();
        defDemo.method();

        ClassesDemo pubObj = new ClassesDemo();
        pubObj.method(); // public method
    //   pubObj.demostrate(); //private method - not visible in this class though same package
        pubObj.protectMe(); // same package - so can be accessed
    }
}
