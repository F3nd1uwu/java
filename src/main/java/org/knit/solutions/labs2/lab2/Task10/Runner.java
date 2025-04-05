package org.knit.solutions.labs2.lab2.Task10;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ThreadLocalRandom;

public class Runner implements Runnable {
    private final String name;
    private final CyclicBarrier startBarrier;
    private final CyclicBarrier finishBarrier;

    public Runner(String name, CyclicBarrier startBarrier, CyclicBarrier finishBarrier) {
        this.name = name;
        this.startBarrier = startBarrier;
        this.finishBarrier = finishBarrier;
    }

    @Override
    public void run() {
        try {
            // Ожидание старта
            System.out.println(name + " готовится к старту.");
            startBarrier.await(); // Ждем, пока все будут готовы

            // Симуляция бега
            int runTime = ThreadLocalRandom.current().nextInt(500, 3000);
            Thread.sleep(runTime);
            System.out.println(name + " финишировал за " + runTime + " мс.");

            // Ожидание всех на финише
            finishBarrier.await(); // Ждем, пока все финишируют

        } catch (Exception e) {
            Thread.currentThread().interrupt();
            System.out.println(name + " не смог завершить гонку.");
        }
    }
}

