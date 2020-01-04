package ru.job4j.collection;

import java.util.Comparator;

/**
 * Класс реализует функционал сортировки приоритета NewUser
 *
 * @author Денис Висков
 * @version 1.0
 * @since 04.01.2020
 */
public class PrioritySorter {
    /**
     * Метод реализует функционал сортрровки приоритета по возрастанию
     *
     * @return - компаратор
     */
    public Comparator<NewUser> order() {
        return new Comparator<NewUser>() {
            @Override
            public int compare(NewUser o1, NewUser o2) {
                return Integer.compare(o1.getPriority(), o2.getPriority());
            }
        };
    }

    /**
     * Метод реализует функционал обратной сортировки приоритета
     *
     * @return - компаратор
     */
    public Comparator<NewUser> reverse() {
        return new Comparator<NewUser>() {
            @Override
            public int compare(NewUser o1, NewUser o2) {
                return Integer.compare(o2.getPriority(), o1.getPriority());
            }
        };
    }
}
