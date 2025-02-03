package ru.netology;

import java.util.Scanner;
import ru.netology.YearGameService;

public class YearGame {
    public static void main (String[] args) {
        runGame();
    }

    public static void runGame() {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        while (true) {
            System.out.print("Введите год: ");
            int year = scanner.nextInt();
            System.out.print("Введите количество дней: ");
            int daysCount = scanner.nextInt();

            int daysInYearCount = YearGameService.getDaysCount(year);
            if (daysCount == daysInYearCount) {
                score++;
            } else {
                System.out.println("Неправильно! В этом году " + daysInYearCount + " дней!");
                System.out.print("Набрано очков: " + score);
                break;
            }
        }
    }
}
