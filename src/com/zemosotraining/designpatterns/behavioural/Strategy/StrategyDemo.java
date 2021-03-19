package com.zemosotraining.designpatterns.behavioural.Strategy;

import java.util.Scanner;
import java.util.logging.Logger;

public class StrategyDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger(StrategyDemo.class.getName());

        StrategyContext context = new StrategyContext(500);
        logger.info("Enter month number between 1 and 12: ");
        int month = scanner.nextInt();
        logger.info("Month = " + month);

        DiscountStrategy strategy = context.getStrategy(month);
        context.applyDiscount(strategy);

    }
}