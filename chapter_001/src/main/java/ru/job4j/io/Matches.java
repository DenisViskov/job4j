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
            matches.first = matches.check(input);
            count -= matches.first;
            System.out.println("Спичек на столе: " + count);
            matches.second = matches.check(input);
            count -= matches.second;
            System.out.println("Спичек на столе: " + count);
        } while (true);
    }

    /**
     * Метод выполняет проверку правильности ввода
     *
     * @param input - Объект scanner
     * @return - количество спичек
     */
    private int check(Scanner input) {
        int result = Integer.valueOf(input.nextLine());
        if (count == 0) {
            System.out.println("Спичек больше нет");
            System.out.println("Введите 0 для завершения игры");
            result = Integer.valueOf(input.nextLine());
        }
        boolean condition = result > 3 || count <= 3 && result > count;
        while (condition) {
            System.out.println("Вы пытаетесь взять слишком большое количество спичек");
            System.out.println("Повторите попытку: ");
            result = Integer.valueOf(input.nextLine());
            condition = result > 3 || count <= 3 && result > count;
        }
        return result;
    }
}
