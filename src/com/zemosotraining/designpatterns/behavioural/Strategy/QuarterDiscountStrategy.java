package com.zemosotraining.designpatterns.behavioural.Strategy;

public class QuarterDiscountStrategy implements DiscountStrategy{
    @Override
    public double getDiscountPercentage() {
        return 0.25;
    }
}
