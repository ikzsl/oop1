package ru.learnup;

public class Wagon {
    String type;
    Passenger[] passengers;

    public Wagon(String type, Passenger[] passengers) {
        this.type = type;
        this.passengers = passengers;
    }
}
