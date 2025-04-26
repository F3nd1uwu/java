package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.labs2.lab5.Task16.*;
import org.knit.solutions.labs2.lab5.Task16.MyCharacter;

@TaskDescription(taskNumber = 16, taskDescription = "2.16 Задача Паттерн Приспособленец (Flyweight)")
public class Task2_16 implements Solution {
    @Override
    public void execute() {
        String text = "Hello, JavaSecondLife!";
        String[] styles = {"regular", "bold", "italic"};

        // Рендерим текст с разными стилями
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            MyCharacter myCharacter = CharacterFactory.getCharacter(Character.valueOf(c));

            // Внешнее состояние передается при рендеринге
            int x = i * 10;
            int y = (i % 3) * 20;
            String style = styles[i % styles.length];

            myCharacter.render(x, y, style);
        }

        // Демонстрация повторного использования символов
        System.out.println("\nПовторное использование символов:");
        MyCharacter h = CharacterFactory.getCharacter('H');
        h.render(100, 100, "bold");
    }
}
