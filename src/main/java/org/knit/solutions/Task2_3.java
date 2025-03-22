package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.labs2.lab1.Task3.Transport;
import org.knit.solutions.labs2.lab1.Task3.TransportFactory;

@TaskDescription(taskNumber = 3, taskDescription = "2.3 Factory (Фабрика)")
public class Task2_3 implements Solution {
    @Override
    public void execute() {
        Transport businessCar = TransportFactory.createTransport("business");
        System.out.println(businessCar.getSpecification());

        Transport familyCar = TransportFactory.createTransport("family");
        System.out.println(familyCar.getSpecification());

        Transport motorbike = TransportFactory.createTransport("delivery");
        System.out.println(motorbike.getSpecification());
    }
}
