package ru.job4j.tracker;

/**
 * Интерфейс ввода- вывода
 *
 * @author Денис Висков
 * @version 1.0
 * @since 06.12.2019
 */
public interface Input {

    /**
     * Реализация вопроса
     *
     * @param question - вопрос
     * @return - ответ
     */
    String askStr(String question);

    /**
     * Реализация вопроса
     *
     * @param question - вопрос
     * @return - ответ
     */
    int askInt(String question);
}
