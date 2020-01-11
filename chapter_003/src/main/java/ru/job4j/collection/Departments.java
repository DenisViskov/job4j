package ru.job4j.collection;

import java.util.*;

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
        Set<String> tmp = new HashSet<>();
        List<String> result;
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                tmp.add(start + el);
                start += el + "/";
            }
        }
        result = new ArrayList<>(tmp);
        sortAsc(result);
        return result;
    }

    /**
     * Метод реализует функционал простой сортировки подразделений организации
     *
     * @param orgs - организация
     */
    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {

    }
}
