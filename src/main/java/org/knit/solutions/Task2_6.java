package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.labs2.lab2.Task6.Car;
import org.knit.solutions.labs2.lab2.Task6.RailwayCrossing;
import org.knit.solutions.labs2.lab2.Task6.Train;

@TaskDescription(taskNumber = 6, taskDescription = "2.6 Задача «Железнодорожный переезд»")
public class Task2_6 implements Solution {
    @Override
    public void execute() {
        RailwayCrossing crossing = new RailwayCrossing();

        Car car1 = new Car(crossing, "Автомобиль 1");
        Car car2 = new Car(crossing, "Автомобиль 2");
        Car car3 = new Car(crossing, "Автомобиль 3");

        Train train = new Train(crossing);
        train.start();

        car1.start();
        car2.start();
        car3.start();
    }
}
