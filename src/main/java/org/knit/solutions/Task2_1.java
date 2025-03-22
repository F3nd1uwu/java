package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.labs2.lab1.Task1.Approver;
import org.knit.solutions.labs2.lab1.Task1.CallCenter;
import org.knit.solutions.labs2.lab1.Task1.Departament;
import org.knit.solutions.labs2.lab1.Task1.Manager;

import java.util.Scanner;

@TaskDescription(taskNumber = 1, taskDescription = "2.1 Паттерны проектирования")
public class Task2_1 implements Solution {
    @Override
    public void execute() {
        Approver callCenter = new CallCenter();
        Approver manager = new Manager();
        Approver departament = new Departament();
        Scanner scanner = new Scanner(System.in);

        callCenter.setNextApprover(manager);
        manager.setNextApprover(departament);

        System.out.println("Введите ваш вопрос: ");
        String userinput = scanner.next();

        System.out.println("В центре поддержки, который перенаправляет запросы: ");
        int value = scanner.nextInt();

        callCenter.processRequest(value);
    }
}
