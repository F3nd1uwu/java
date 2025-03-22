package org.knit.solutions.labs2.lab2.Task5;

public class Cook extends Thread {
    private Restaurant restaurant;

    public Cook(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            restaurant.produce();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
