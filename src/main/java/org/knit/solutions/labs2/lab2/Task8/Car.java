package org.knit.solutions.labs2.lab2.Task8;

public class Car extends Thread {
    private final TrafficLight trafficLight;

    public Car(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (trafficLight) {
                while (!trafficLight.isGreen()) {
                    try {
                        System.out.println(Thread.currentThread().getName() + ": Ожидание на красном свете.");
                        trafficLight.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println(Thread.currentThread().getName() + ": Машина едет на зеленом свете.");
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}