package org.knit.solutions.labs2.lab2.Task6;

public class Car extends Thread {
    private final RailwayCrossing crossing;

    public Car(RailwayCrossing crossing, String name) {
        super(name);
        this.crossing = crossing;
    }

    @Override
    public void run() {
        try {
            crossing.waitForTrain();
            System.out.println(getName() + " продолжает движение.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}