package com.zemosotraining.designprinciples.delegation;

public class DelegationDemo {
    public static void main(String[] args) {
        TravelAgent agent = new TravelAgent(new TrainTicket());
        agent.bookTicket();


    }
}
