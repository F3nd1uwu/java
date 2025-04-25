package org.knit.solutions.labs2.lab5.Task16;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static final Map<java.lang.Character, ConcreteCharacter> characters = new HashMap<>();

    public static Character getCharacter(char charCode) {
        // Проверяем, есть ли уже такой символ
        Character character = characters.get(charCode);

        if (character == null) {
            // Если нет - создаем новый
            character = new ConcreteCharacter(charCode);
            characters.put(charCode, (ConcreteCharacter) character);
            System.out.println("Создан новый символ: " + charCode);
        }

        return character;
    }
}
