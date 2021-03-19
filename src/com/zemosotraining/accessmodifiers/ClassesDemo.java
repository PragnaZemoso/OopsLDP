package com.zemosotraining.accessmodifiers;

// public - anywhere with proper imports done
public class ClassesDemo {
    public static void method() {
        System.out.println("This is a Public Class");
    }

    // private - Class level visibility only
    private void demonstrate(){
        System.out.println("THis is private method");
    }

    // protected - all classes of same package & child classes in any package
    protected void protectMe(){
        System.out.println("This is protected method of public class - ClassesDemo");
    }
}

// default: package-level
class DefaultDemo{
    public static void method() {
        System.out.println("This is default class");
    }
}

