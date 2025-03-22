package org.knit.solutions.labs2.lab1.Task1;

public class Departament extends Approver {
    @Override
    protected boolean canApprove(int amount) {
        return amount <= 3;
    }

    @Override
    protected void approve(int amount) {
        System.out.println("Юридический отдел обработал вашу заявку. Сложность запроса: " + amount);
    }
}
