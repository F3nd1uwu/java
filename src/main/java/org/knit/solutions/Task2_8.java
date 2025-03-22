package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.labs2.lab2.Task8.Car;
import org.knit.solutions.labs2.lab2.Task8.TrafficLight;

@TaskDescription(taskNumber = 8, taskDescription = "2.8 Задача «Перекресток: светофор и машины» ")
public class Task2_8 implements Solution {
    @Override
    public void execute() {
        TrafficLight trafficLight = new TrafficLight();

        new Thread(() -> trafficLight.switchLight()).start();

        for (int i = 1; i <= 5; i++) {
            new Car(trafficLight).start();
        }
    }
}
