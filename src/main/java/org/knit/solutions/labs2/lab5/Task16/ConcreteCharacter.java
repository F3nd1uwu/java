package org.knit.solutions.labs2.lab5.Task16;

public class ConcreteCharacter implements Character {
    private char charCode; // Внутреннее состояние

    public ConcreteCharacter(char charCode) {
        this.charCode = charCode;
    }

    @Override
    public void render(int x, int y, String style) {
        System.out.printf("Символ '%c' отображен в позиции (%d, %d) со стилем %s\n",
                charCode, x, y, style);
    }
}
