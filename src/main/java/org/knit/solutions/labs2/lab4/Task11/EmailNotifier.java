package org.knit.solutions.labs2.lab4.Task11;

public class EmailNotifier implements StockObserver {
    private String email;

    public EmailNotifier(String email) {
        this.email = email;
    }

    @Override
    public void update(String stockName, double newPrice) {
        System.out.println("Email-уведомление: " + email + " получил уведомление о " + stockName + ": новая цена " + newPrice);
    }

    @Override
    public String getIdentifier() {
        return email; // Возвращаем email
    }
}
