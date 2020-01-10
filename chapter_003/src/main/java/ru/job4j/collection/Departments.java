package ru.job4j.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Класс реализует функционал сортировки департаментов
 *
 * @author Денис Висков
 * @version 1.0
 * @since 10.01.2020
 */
public class Departments {

    /**
     * Метод реализует функционал разделения департаментов на отдельные подразделения
     *
     * @param deps - департаменты
     * @return - список департаментов
     */
    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                tmp.add(start + "/" + el);
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
    }

    public static void sortDesc(List<String> orgs) {
    }
}
