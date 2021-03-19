package com.zemosotraining.designpatterns.creational.Prototype.deepCopy;

public class Main {
    public static void main(String[] args) {
        int[] values = {1,2,3};
        Example example = new Example(values);

        example.showData();
        values[1] = 20;
        example.showData();
    }
}
