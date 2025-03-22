package org.knit.solutions.labs2.lab2.Task4;

import java.util.concurrent.*;

public class Car extends Thread {
    private final Semaphore semaphore;
    private final String name;

    public Car(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(name + " начала заправляться.");
            Thread.sleep(2000);
            System.out.println(name + " уехала.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}