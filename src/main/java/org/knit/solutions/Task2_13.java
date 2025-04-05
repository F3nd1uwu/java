package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.labs2.lab4.Task13.*;

@TaskDescription(taskNumber = 13, taskDescription = "2.13 Задача Реализация системы команд для управления умным домом")
public class Task2_13 implements Solution {
    @Override
    public void execute() {
        // Создаем устройства умного дома
        Light livingRoomLight = new Light();
        TV livingRoomTV = new TV();

        // Создаем команды для управления устройствами
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command tvOn = new TVOnCommand(livingRoomTV);
        Command tvOff = new TVOffCommand(livingRoomTV);

        // Создаем пульт управления
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();  // Включает свет

        remoteControl.setCommand(tvOn);
        remoteControl.pressButton();  // Включает телевизор

        remoteControl.pressUndoButton();  // Выключает телевизор

        remoteControl.setCommand(lightOff);
        remoteControl.pressButton();  // Выключает свет

        remoteControl.pressUndoButton();  // Включает свет снова
    }
}
