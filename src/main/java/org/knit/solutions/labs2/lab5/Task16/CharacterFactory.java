package org.knit.solutions.labs2.lab5.Task16;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static final Map<Character, MyCharacter> characters = new HashMap<>();

    public static MyCharacter getCharacter(Character charCode) {
        // Проверяем, есть ли уже такой символ
        MyCharacter myCharacter = characters.get(charCode);

        if (myCharacter == null) {
            // Если нет - создаем новый
            myCharacter = new ConcreteMyCharacter(charCode);
            characters.put(charCode, myCharacter);
            System.out.println("Создан новый символ: " + charCode);
        }

        return myCharacter;
    }
}
