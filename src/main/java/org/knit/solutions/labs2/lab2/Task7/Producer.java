package org.knit.solutions.labs2.lab2.Task7;

public class Producer extends Thread {
    private final Warehouse warehouse;

    public Producer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 20; i++) {
                warehouse.produce(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
