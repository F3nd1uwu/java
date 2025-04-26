package org.knit.solutions.labs2.lab5.Task16;

public class ConcreteMyCharacter implements MyCharacter {
    private final Character charCode; // Внутреннее состояние

    public ConcreteMyCharacter(Character charCode) {
        this.charCode = charCode;
    }

    @Override
    public void render(int x, int y, String style) {
        System.out.printf("Символ '%c' отображен в позиции (%d, %d) со стилем %s\n",
                charCode, x, y, style);
    }
}
