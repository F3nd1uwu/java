package org.knit.solutions.labs2.lab5.Task15;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromServer();
    }

    private void loadFromServer() {
        System.out.println("Загрузка изображения " + filename + " с сервера...");
        // Имитация задержки загрузки
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Изображение " + filename + " загружено");
    }

    @Override
    public void display() {
        System.out.println("Отображение изображения " + filename);
    }
}
