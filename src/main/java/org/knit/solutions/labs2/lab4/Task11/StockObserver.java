package org.knit.solutions.labs2.lab4.Task11;

public interface StockObserver {
    void update(String stockName, double newPrice);
    String getIdentifier();

}