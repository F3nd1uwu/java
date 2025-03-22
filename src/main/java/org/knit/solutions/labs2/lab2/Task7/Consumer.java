package org.knit.solutions.labs2.lab2.Task7;

public class Consumer extends Thread {
    private final Warehouse warehouse;

    public Consumer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 20; i++) {
                warehouse.consume();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}