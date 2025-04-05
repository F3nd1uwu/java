package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.labs2.lab4.Task12.Caretaker;
import org.knit.solutions.labs2.lab4.Task12.TextEditor;

@TaskDescription(taskNumber = 12, taskDescription = "2.12 Задача Реализация системы отмены изменений в текстовом редакторе")
public class Task2_12 implements Solution {
    @Override
    public void execute() {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        // Пользователь вводит текст "Hello, world!"
        editor.setText("Hello, world!");
        System.out.println("Текущий текст: " + editor.getText());

        // Сохраняем текущее состояние
        caretaker.save(editor);

        // Добавляем " How are you?"
        editor.appendText(" How are you?");
        System.out.println("Текущий текст после добавления: " + editor.getText());

        // Нажимаем "Отменить" и возвращаемся к "Hello, world!"
        caretaker.undo(editor);
        System.out.println("Текущий текст после отмены: " + editor.getText());

        // Попробуем отменить еще раз (не должно быть доступных состояний)
        caretaker.undo(editor);

        // Проверяем текущее состояние текста
        System.out.println("Текущий текст после второй отмены: " + editor.getText());
    }
}
