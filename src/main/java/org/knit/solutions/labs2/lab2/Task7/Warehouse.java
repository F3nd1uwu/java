package org.knit.solutions.labs2.lab2.Task7;

import java.util.LinkedList;
import java.util.Queue;

public class Warehouse {
    private final int capacity;
    private final Queue<Integer> products;

    public Warehouse(int capacity) {
        this.capacity = capacity;
        this.products = new LinkedList<>();
    }

    public synchronized void produce(int product) throws InterruptedException {
        while (products.size() >= capacity) {
            System.out.println("Склад заполнен. Производитель ждет...");
            wait();
        }
        products.add(product);
        System.out.println("Производитель создал товар: " + product);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (products.isEmpty()) {
            System.out.println("Нет товаров. Потребитель ждет...");
            wait();
        }
        int product = products.poll();
        System.out.println("Потребитель забрал товар: " + product);
        notifyAll();
        return product;
    }
}