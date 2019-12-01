package ru.job4j.oop;

/**
 * Класс реализующий пример использования переопределения методов
 *
 * @author Денис Висков
 * @version 1.0
 * @since 01.12.2019
 */
public class TextReport {
    /**
     * Метод реализует генерацию имени и тела
     *
     * @param name - имя
     * @param body - тело
     * @return - имя + тело
     */
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}
