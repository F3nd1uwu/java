package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.labs2.lab2.Task10.Runner;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@TaskDescription(taskNumber = 10, taskDescription = "2.10 Задача Гонка бегунов с использованием CyclicBarrier ")
public class Task2_10 implements Solution {
    @Override
    public void execute() {
        int numberOfRunners = 5; // Количество бегунов

        // Создаем барьеры для старта и финиша
        CyclicBarrier startBarrier = new CyclicBarrier(numberOfRunners);
        CyclicBarrier finishBarrier = new CyclicBarrier(numberOfRunners, () -> {
            System.out.println("Все бегуны завершили гонку!");
        });

        ExecutorService executor = Executors.newFixedThreadPool(numberOfRunners);

        for (int i = 1; i <= numberOfRunners; i++) {
            executor.execute(new Runner("Бегун " + i, startBarrier, finishBarrier));
        }

        executor.shutdown();
    }
}
