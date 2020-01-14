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
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                tmp.add(start + el);
                start += el + "/";
            }
        }
        return new ArrayList<>(tmp);
    }

    /**
     * Метод реализует функционал поиска недостающих департаментов
     * и стандартной сортировки подразделений организации
     *
     * @param orgs
     * @return - сортированный список
     */
    public static List sortAsc(List<String> orgs) {
        orgs = fillGaps(orgs);
        Collections.sort(orgs, new DepDescComp());
        return orgs;
    }

    /**
     * Метод реализует функционал поиска недостающих департаментов
     * и обратной сортировки подразделений организации
     *
     * @param orgs - организация
     * @return - сортированный список
     */
    public static List sortDesc(List<String> orgs) {
        orgs = fillGaps(orgs);
        DepDescComp increase = new DepDescComp();
        DepAscComp decrease = new DepAscComp();
        ListIterator<String> listIterator = orgs.listIterator();
        while (listIterator.hasNext()) {
            String first = listIterator.next();
            String second = listIterator.next();
            int result = decrease.compare(first, second);
            if (result != 0) {
                // Какой алгоритм использовать не знаю
            }
        }
        return null;
    }
}
