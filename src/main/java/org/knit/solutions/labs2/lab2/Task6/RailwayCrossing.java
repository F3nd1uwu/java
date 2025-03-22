package org.knit.solutions.labs2.lab2.Task6;

public class RailwayCrossing {
    private boolean trainArriving;

    public synchronized void waitForTrain() throws InterruptedException {
        while (trainArriving) {
            System.out.println(Thread.currentThread().getName() + " остановился и ждет.");
            wait();
        }
    }

    public synchronized void trainArrives() {
        trainArriving = true;
        System.out.println("Поезд прибывает! Все автомобили должны остановиться.");
    }

    public synchronized void trainPasses() {
        trainArriving = false;
        System.out.println("Поезд проехал! Автомобили могут двигаться.");
        notifyAll();
    }
}
