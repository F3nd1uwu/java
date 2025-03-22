package org.knit.solutions.labs2.lab2.Task5;

public class Waiter extends Thread {
    private Restaurant restaurant;

    public Waiter(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        for (int i = 20; i > 0; i--) {
            restaurant.consume();
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
