package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.labs2.lab5.Task15.*;

@TaskDescription(taskNumber = 15, taskDescription = "2.15 Задача Паттерн Прокси (Proxy)")
public class Task2_15 implements Solution {
    @Override
    public void execute() {
        System.out.println("Создаем прокси для изображений (реальные изображения еще не загружены)");
        Image image1 = new ImageProxy("photo1.jpg");
        Image image2 = new ImageProxy("photo2.jpg");

        System.out.println("\nПервый вызов display() - изображение будет загружено");
        image1.display();

        System.out.println("\nВторой вызов display() - изображение уже загружено (из кэша)");
        image1.display();

        System.out.println("\nПервое обращение ко второму изображению");
        image2.display();
    }
}
