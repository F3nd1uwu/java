package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.labs2.lab4.Task11.EmailNotifier;
import org.knit.solutions.labs2.lab4.Task11.MobileApp;
import org.knit.solutions.labs2.lab4.Task11.Stock;

@TaskDescription(taskNumber = 11, taskDescription = "2.11 Задача Реализация системы уведомлений в биржевом приложении")
public class Task2_11 implements Solution {
    @Override
    public void execute() {
        // Создаем акции IntelliJ
        Stock teslaStock = new Stock("IntelliJ", 700.0);

        // Создаем наблюдателей
        MobileApp mobileUser1 = new MobileApp("Дмитрий");
        EmailNotifier emailUser1 = new EmailNotifier("yasakov@gmail.com");

        // Подписываемся на акции IntelliJ
        teslaStock.subscribe(mobileUser1);
        teslaStock.subscribe(emailUser1);

        // Изменяем цену акций IntelliJ
        teslaStock.setPrice(750.0); // Уведомит всех подписчиков

        // Отписываемся от акций IntelliJ
        teslaStock.unsubscribe(emailUser1);

        // Изменяем цену акций IntelliJ снова
        teslaStock.setPrice(800.0); // Уведомит только мобильного пользователя
    }
}
