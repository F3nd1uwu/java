package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.labs2.lab2.Task5.Cook;
import org.knit.solutions.labs2.lab2.Task5.Restaurant;
import org.knit.solutions.labs2.lab2.Task5.Waiter;

@TaskDescription(taskNumber = 5, taskDescription = "2.5 Задача «Ресторан: Повар и Официант» ")
public class Task2_5 implements Solution {
    @Override
    public void execute() {
        Restaurant restaurant = new Restaurant();

        Cook cook = new Cook(restaurant);
        Waiter waiter = new Waiter(restaurant);

        cook.start();
        waiter.start();
    }
}
