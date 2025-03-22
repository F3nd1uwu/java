package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.labs2.lab2.Task7.Consumer;
import org.knit.solutions.labs2.lab2.Task7.Producer;
import org.knit.solutions.labs2.lab2.Task7.Warehouse;

@TaskDescription(taskNumber = 7, taskDescription = "2.7 Задача «Производитель-Потребитель с ограничением»")
public class Task2_7 implements Solution {
    @Override
    public void execute() {
        Warehouse warehouse = new Warehouse(5);

        Producer producer = new Producer(warehouse);
        Consumer consumer = new Consumer(warehouse);

        producer.start();
        consumer.start();
    }
}
