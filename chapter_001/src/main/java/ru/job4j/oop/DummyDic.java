package ru.job4j.oop;

/**
 * Класс реализует функционал перевода слова
 *
 * @author Денис Висков
 * @version 1.0
 * @since 27.11.2019
 */
public class DummyDic {

    /**
     * Метод возвращает "Неизвестное слово" + параметр
     *
     * @param eng - Аргумент
     * @return - "Неизвестное слово" + параметр
     */
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }
}
