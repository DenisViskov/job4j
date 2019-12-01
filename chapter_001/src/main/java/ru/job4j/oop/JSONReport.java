package ru.job4j.oop;

/**
 * Класс реализует функционал переопределения методов
 *
 * @author Денис Висков
 * @version 1.0
 * @since 01.12.2019
 */
public class JSONReport extends TextReport {

    /**
     * Метод реализует генерацию имени и тела и возвращает в JSON формате
     *
     * @param name - имя
     * @param body - тело
     * @return - имя + тело в JSON формате
     */
    @Override
    public String generate(String name, String body) {
        return "name" + ":" + name + "," + "\n" + "body" + ":" + body;
    }
}
