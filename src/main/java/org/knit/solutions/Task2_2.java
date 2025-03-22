package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.labs2.lab1.Task2.*;

@TaskDescription(taskNumber = 2, taskDescription = "2.2 Decorator (Декоратор)")
public class Task2_2 implements Solution {
    @Override
    public void execute() {
        // Базовый кофе
        Coffee coffee = new Espresso();
        System.out.println(coffee.getDescription() + " | Цена: ₽" + coffee.getCost() + " | Калорийность: " + coffee.getCalories() + " ккал");

        // Добавляем размер (medium)
        coffee = new SizeDecorator(coffee, "medium");
        System.out.println(coffee.getDescription() + " | Цена: ₽" + coffee.getCost() + " | Калорийность: " + coffee.getCalories() + " ккал");

        // Добавляем молоко
        coffee = new Milk(coffee);
        System.out.println(coffee.getDescription() + " | Цена: ₽" + coffee.getCost() + " | Калорийность: " + coffee.getCalories() + " ккал");

        // Добавляем карамель
        coffee = new Caramel(coffee);
        System.out.println(coffee.getDescription() + " | Цена: ₽" + coffee.getCost() + " | Калорийность: " + coffee.getCalories() + " ккал");

        // Добавляем шоколад
        coffee = new Chocolate(coffee);
        System.out.println(coffee.getDescription() + " | Цена: ₽" + coffee.getCost() + " | Калорийность: " + coffee.getCalories() + " ккал");
    }
}
