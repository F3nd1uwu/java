package org.knit.solutions.labs2.lab2.Task5;

public class Restaurant {
    private int product = 0;

    public synchronized void produce() {
        while (product >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product++;
        System.out.println("Повар приготовил блюдо. Всего на столе подачи: " + product);
        notify();
    }

    public synchronized void consume() {
        while (product <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product--;
        System.out.println("Официант отнес блюдо клиенту. Осталось на столе подачи: " + product);
        notify();
    }
}
