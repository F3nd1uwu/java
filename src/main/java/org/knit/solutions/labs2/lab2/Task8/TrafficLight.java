package org.knit.solutions.labs2.lab2.Task8;

public class TrafficLight {
    private boolean isGreen; // true - зеленый, false - красный

    public TrafficLight() {
        this.isGreen = false;
    }

    public synchronized void switchLight() {
        while (true) {
            isGreen = !isGreen;
            if (isGreen) {
                System.out.println("Светофор: Зеленый свет. Машины могут ехать.");
                notifyAll();
            } else {
                System.out.println("Светофор: Красный свет. Машины стоят.");
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public synchronized boolean isGreen() {
        return isGreen;
    }
}
