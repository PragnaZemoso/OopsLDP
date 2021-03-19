package com.zemosotraining.oops;

// MethodOverloading: Same method name but different signatures
// compile-time Polymorphism or Early-binding

class Addition{
    public void add(int num1,int num2){
        System.out.println("Sum of 2 integers: " + num1+num2);
    }

    // No. of arguments
    public void add(int num1,int num2,int num3){
        System.out.println("Sum : " + num1+num2+num3);
    }

    public void add(double num1,double num2,double num3){
        System.out.println("Sum : " + (num1+num2+num3));
    }
}
public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Addition addObj = new Addition();
        addObj.add(3,4);
        addObj.add(3,4,5);
        addObj.add(3.4f,6.324,10.33);

        /* internal promotion order:
        byte -> short ->  int -> long -> float -> double
                            ^
                            |
                           char
         */

    }
}
