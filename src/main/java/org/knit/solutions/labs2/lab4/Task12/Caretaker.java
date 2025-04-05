package org.knit.solutions.labs2.lab4.Task12;

import java.util.Stack;

public class Caretaker {
    private Stack<Memento> history;

    public Caretaker() {
        history = new Stack<>();
    }

    // Сохранение состояния
    public void save(TextEditor editor) {
        history.push(editor.saveState());
    }

    // Отмена последнего изменения
    public void undo(TextEditor editor) {
        if (!history.isEmpty()) {
            Memento memento = history.pop();
            editor.restoreState(memento);
        } else {
            System.out.println("Нет доступных состояний для отмены.");
        }
    }
}
