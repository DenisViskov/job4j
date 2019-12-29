package ru.job4j.collection;

import java.util.ArrayList;

/**
 * Класс реализует демонстрацию работы ArrayList
 *
 * @author Денис Висков
 * @version 1.0
 * @since 29.12.2019
 */
public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> example = new ArrayList<>();
        example.add("Petr");
        example.add("Ivan");
        example.add("Stepan");
        for (String names : example) {
            System.out.println(names);
        }
    }
}
