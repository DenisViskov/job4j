package ru.job4j.oop;

/**
 * Класс реализующий функционал работы переопределения методов
 *
 * @author Денис Висков
 * @version 1.0
 * @since 01.12.2019
 */
public class HtmlReport extends TextReport {

    /**
     * Метод реализует генерацию имени и тела и возвращает в HTML формате
     *
     * @param name - имя
     * @param body - тело
     * @return - имя + тело в HTML формате
     */
    @Override
    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>"
                + "<br/>" + "<span>" + body + "</span>";
    }
}
