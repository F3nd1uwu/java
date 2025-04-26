package org.knit.solutions;

import org.knit.TaskDescription;

import java.util.Random;

@TaskDescription(taskNumber = 17, taskDescription = "2.17 Задача Реализация и проверка парадокса Монти Холла")
public class Task2_17 implements Solution {
    @Override
    public void execute() {
        int totalGames = 1000000;
        int stayWins = 0;
        int switchWins = 0;
        Random random = new Random();

        for (int i = 0; i < totalGames; i++) {
            // Приз находится за случайной дверью (0, 1 или 2)
            int prizeDoor = random.nextInt(3);

            // Игрок выбирает случайную дверь
            int playerChoice = random.nextInt(3);

            // Ведущий открывает дверь, которая не является выбранной игроком и не содержит приз
            int openedDoor;
            do {
                openedDoor = random.nextInt(3);
            } while (openedDoor == playerChoice || openedDoor == prizeDoor);

            // Если игрок не меняет выбор
            if (playerChoice == prizeDoor) {
                stayWins++;
            }

            // Если игрок меняет выбор на оставшуюся дверь
            int switchedChoice;
            do {
                switchedChoice = random.nextInt(3);
            } while (switchedChoice == playerChoice || switchedChoice == openedDoor);

            if (switchedChoice == prizeDoor) {
                switchWins++;
            }
        }

        // Вычисляем вероятности
        double stayWinProbability = (double) stayWins / totalGames * 100;
        double switchWinProbability = (double) switchWins / totalGames * 100;

        System.out.println("Результаты после " + totalGames + " игр:");
        System.out.printf("Вероятность выигрыша без смены выбора: %.2f%%\n", stayWinProbability);
        System.out.printf("Вероятность выигрыша при смене выбора: %.2f%%\n", switchWinProbability);
    }
}
