package com.zemosotraining.practice;

import com.zemosotraining.accessmodifiers.ClassesDemo;

public class TestProtected extends ClassesDemo {
    public static void main(String[] args) {
        System.out.println("This is TestProtected - subclass of ClassesDemo");
        TestProtected protectObj = new TestProtected();
        protectObj.protectMe(); // protectMe method accessed via subclass reference
    }
}
