package org.knit.solutions.labs2.lab4.Task13;

public class RemoteControl {
    private Command command;

    // Установка команды
    public void setCommand(Command command) {
        this.command = command;
    }

    // Выполнение команды
    public void pressButton() {
        if (command != null) {
            command.execute();
        } else {
            System.out.println("Команда не установлена.");
        }
    }

    // Отмена последней команды
    public void pressUndoButton() {
        if (command != null) {
            command.undo();
        } else {
            System.out.println("Нет команды для отмены.");
        }
    }
}