package com.zemosotraining.designpatterns.creational.Prototype.shallowCopy;

import java.util.Arrays;

public class Example {

    private int[] data;

    // makes a shallow copy of values
    //data simply refers to the same array as values
    public Example(int[] values) {
        data = values;
    }

    public void showData() {
        System.out.println( Arrays.toString(data) );
    }
}