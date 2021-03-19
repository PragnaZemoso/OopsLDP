package com.zemosotraining.designprinciples.delegation;

//Delegation  : giving Authority to one person ~ TravelAgent
public interface Travels {
    public void bookTicket();
}

class FlightTicket implements Travels {

    @Override
    public void bookTicket() {
        // logic for booking flight ticket
        System.out.println("Flight ticket booked successfully!");
    }
}

class TrainTicket implements Travels {

    @Override
    public void bookTicket() {
        // logic for booking train ticket
        System.out.println("Train ticket booked successfully!");
    }
}


class TravelAgent implements Travels {
    Travels ticketType;

    public TravelAgent(Travels t) {
        this.ticketType = t;
    }

    @Override
    public void bookTicket() {
        ticketType.bookTicket();
    }
}