package ru.job4j.io;

import java.util.Scanner;

/**
 * Класс реализует функционал игры 11 спичек
 *
 * @author Денис Висков
 * @version 1.0
 * @since 04.12.2019
 */
public class Matches {
    /**
     * Количество спичек на столе
     */
    private static int count = 11;

    /**
     * Первый игрок
     */
    private int first;

    /**
     * Второй игрок
     */
    private int second;

    public Matches(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Matches matches = new Matches(0, 0);
        do {
            if (count <= 0) {
                break;
            }
            System.out.println("Возьмите спички в кол-ве от 1 до 3");
            matches.first = Integer.valueOf(input.nextLine());
            count -= matches.first;
            String answer = count < 0 || matches.first > 3 ? "Вы пытаетесь взять слишком большое кол-во спичек" : "Спичек на столе: " + count;
            System.out.println(answer);
            matches.second = Integer.valueOf(input.nextLine());
            count -= matches.second;
            answer = count < 0 || matches.second > 3 ? "Вы пытаетесь взять слишком большое кол-во спичек" : "Спичек на столе: " + count;
            System.out.println(answer);
            if (matches.first > 3 || matches.second > 3) {
                System.out.println("Начинаем игру сначала");
                matches.restartGame();
            }
        } while (true);
    }

    /**
     * Метод выполняет сброс всех параметров в значения по умолчанию
     */
    private void restartGame() {
        this.first = 0;
        this.second = 0;
        count = 11;
    }
}
