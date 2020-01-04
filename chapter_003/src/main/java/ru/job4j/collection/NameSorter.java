package ru.job4j.collection;

import java.util.Comparator;

/**
 * Класс реализует функционал сортроовки имени NewUser
 *
 * @author Денис Висков
 * @version 1.0
 * @since 04.01.2020
 */
public class NameSorter {
    /**
     * Метод реализует функционал сортрровки имени по возрастанию
     *
     * @return - компаратор
     */
    public Comparator<NewUser> order() {
        return new Comparator<NewUser>() {
            @Override
            public int compare(NewUser o1, NewUser o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
    }

    /**
     * Метод реализует функционал обратной сортировки имени
     *
     * @return - компаратор
     */
    public Comparator<NewUser> reverse() {
        return new Comparator<NewUser>() {
            @Override
            public int compare(NewUser o1, NewUser o2) {
                return o2.getName().compareTo(o1.getName());
            }
        };
    }
}
