package com.zemosotraining.designpatterns.creational.Prototype.deepCopy;

import java.util.Arrays;

public class Example {

    private int[] data;

    // makes a deep copy of values into data
    public Example(int[] values) {
        data = new int[values.length];
        for(int i =0;i<data.length;i++) {
            data[i] = values[i];
        }
    }

    public void showData() {
        System.out.println( Arrays.toString(data) );
    }
}