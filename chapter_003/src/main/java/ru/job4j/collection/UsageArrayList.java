package ru.job4j.collection;

import java.util.List;

/**
 * Класс реализует демонстрацию работы ArrayList
 *
 * @author Денис Висков
 * @version 1.0
 * @since 29.12.2019
 */
public class UsageArrayList {
    public static void main(String[] args) {
        List<String> example = List.of("Petr",
                "Ivan",
                "Stepan");
        for (String names : example) {
            System.out.println(names);
        }
    }
}
