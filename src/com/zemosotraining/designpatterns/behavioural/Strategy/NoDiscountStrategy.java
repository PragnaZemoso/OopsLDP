package com.zemosotraining.designpatterns.behavioural.Strategy;

public class NoDiscountStrategy implements DiscountStrategy{
    @Override
    public double getDiscountPercentage() {
        return 0;
    }
}
