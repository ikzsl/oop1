package ru.learnup;

public class Train {
    private Locomotive locomotive;
    private Wagon[] wagons;

    public Train(Locomotive locomotive,Wagon[] wagons) {
        this.wagons = wagons;
        this.locomotive = locomotive;
    }

    public void move(Station destination) {
        System.out.println("Приехали в " + destination.stationName);
    }
}
