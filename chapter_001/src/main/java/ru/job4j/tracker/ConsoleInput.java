package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Класс реализует ввод данных с консоли через реализацию интерфейса Input
 *
 * @author Денис Висков
 * @version 1.0
 * @since 06.12.2019
 */
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    /**
     * Метод выводит на консоль вопрос и возвращает ответ
     *
     * @param question - вопрос
     * @return - ответ
     */
    @Override
    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    /**
     * Метод спрашивает пользователя и получает ответ
     *
     * @param question - вопрос
     * @return - ответ
     */
    @Override
    public int askInt(String question) {
        System.out.print(question);
        return Integer.valueOf(askStr(question));
    }
}
