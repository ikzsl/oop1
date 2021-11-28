package ru.learnup;

public class Passenger {
    Ticket ticket;
    Luggage[] luggage;

    public Passenger(Ticket ticket, Luggage[] luggage) {
        this.ticket = ticket;
        this.luggage = luggage;
    }

    public Passenger(Ticket ticket) {
        this.ticket = ticket;
    }

    public void snore() {
        System.out.println("хрррр-хрррррр");
    }
}
