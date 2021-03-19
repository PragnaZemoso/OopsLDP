package com.zemosotraining.designpatterns.behavioural.Strategy;

import java.util.logging.Logger;

/* Context is optional. But if it is present, it acts as single point of contact for client.

   Multiple uses of Context
   1. It can populate data to execute an operation of strategy
   2. It can take independent decision on Strategy creation.
   3. In absence of Context, client should be aware of concrete strategies. Context acts a wrapper and hides internals
   4. Code re-factoring will become easy
*/

public class StrategyContext {

    double ticketPrice;
    private DiscountStrategy strategy;
    Logger logger = Logger.getLogger(StrategyContext.class.getName());

    public StrategyContext(double price) {
        this.ticketPrice = price;
    }

    public DiscountStrategy getStrategy(int monthNo) {
        if (monthNo < 6) {
            strategy = new NoDiscountStrategy();
        } else {
            strategy = new QuarterDiscountStrategy();
        }
        logger.info("Strategy applied: " + strategy);
        return strategy;
    }

    public void applyDiscount(DiscountStrategy strategy) {
        logger.info("Ticket Price before offer : " + ticketPrice);
        double finalPrice = ticketPrice - (ticketPrice * strategy.getDiscountPercentage());
        logger.info("Ticket Price after offer : " + finalPrice);
    }
}
