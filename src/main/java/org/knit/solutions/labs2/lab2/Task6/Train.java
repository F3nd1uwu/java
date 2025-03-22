package org.knit.solutions.labs2.lab2.Task6;

public class Train extends Thread {
    private final RailwayCrossing crossing;

    public Train(RailwayCrossing crossing) {
        this.crossing = crossing;
    }

    @Override
    public void run() {
        crossing.trainArrives();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        crossing.trainPasses();
    }
}