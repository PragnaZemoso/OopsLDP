package com.zemosotraining.practice;

import com.zemosotraining.accessmodifiers.ClassesDemo;

public class TestClasses {
    public static void main(String[] args) {
        ClassesDemo demo = new ClassesDemo();
        demo.method();
    //    demo.demonstrate(); // private method not visible in this practice package TestClasses
    //    demo.protectMe(); // NOt visible, since its not child of ClassesDemo


    }
}
