package ru.learnup;

public class Main {

    public static void main(String[] args) {
        Station station1 = new Station(14, "Tomsk");
        Locomotive locomotive = new Locomotive(120, 30);
        Ticket ticket = new Ticket(100);
        Passenger passenger1 = new Passenger(ticket);
        Passenger passenger2 = new Passenger(ticket);
        Passenger[] passengers1 = {passenger1};
        Passenger[] passengers2 = {passenger2};
        Wagon wagon1 = new Wagon("купе", passengers1);
        Wagon wagon2 = new Wagon("СВ", passengers2);
        Wagon[] wagons = {wagon1, wagon2};
        Train train1 = new Train(locomotive, wagons);
        train1.move(station1);
    }
}
