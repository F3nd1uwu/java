package org.knit.solutions.labs2.lab4.Task11;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private String name;
    private double price;
    private List<StockObserver> observers;

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
        this.observers = new ArrayList<>();
    }

    // Метод для подписки на изменения цены
    public void subscribe(StockObserver observer) {
        observers.add(observer);
        System.out.println(observer.getIdentifier() + " подписался на акции " + name);
    }

    // Метод для отписки от изменений цены
    public void unsubscribe(StockObserver observer) {
        observers.remove(observer);
        System.out.println(observer.getClass().getSimpleName() + " отписался от акций " + name);
    }

    // Метод для изменения цены и уведомления подписчиков
    public void setPrice(double newPrice) {
        if (this.price != newPrice) {
            this.price = newPrice;
            notifyObservers();
        }
    }

    // Метод для уведомления всех подписчиков об изменении цены
    private void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(name, price);
        }
    }
}