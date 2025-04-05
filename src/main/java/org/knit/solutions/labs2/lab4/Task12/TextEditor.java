package org.knit.solutions.labs2.lab4.Task12;

public class TextEditor {
    private StringBuilder currentText;

    public TextEditor() {
        currentText = new StringBuilder();
    }

    public void setText(String text) {
        currentText = new StringBuilder(text);
    }

    public String getText() {
        return currentText.toString();
    }

    public void appendText(String text) {
        currentText.append(text);
    }

    // Создание снимка состояния
    public Memento saveState() {
        return new Memento(currentText.toString());
    }

    // Восстановление состояния из снимка
    public void restoreState(Memento memento) {
        currentText = new StringBuilder(memento.getText());
    }
}
