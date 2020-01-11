package ru.job4j.collection;

import java.util.Comparator;

/**
 * Класс реализует функционал сложной обратной сортровки подразделений организации
 *
 * @author Денис Висков
 * @version 1.0
 * @since 11.01.2020
 */
public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
