package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.labs2.lab2.Task4.Car;

import java.util.concurrent.*;

@TaskDescription(taskNumber = 4, taskDescription = "2.4 Задача «Автозаправочная станция» ")
public class Task2_4 implements Solution {
    @Override
    public void execute() {
        Semaphore semaphore = new Semaphore(2);

        for (int i = 1; i <= 10; i++) {
            new Car(semaphore, "Машина " + i).start();
        }
    }
}
