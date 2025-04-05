package org.knit.solutions.labs2.lab4.Task11;

public class MobileApp implements StockObserver {
    private String userName;

    public MobileApp(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String stockName, double newPrice) {
        System.out.println("Мобильное приложение: " + userName + " получил уведомление о " + stockName + ": новая цена " + newPrice);
    }

    @Override
    public String getIdentifier() {
        return userName; // Возвращаем имя пользователя
    }
}
