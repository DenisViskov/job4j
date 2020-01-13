package ru.job4j.collection;

import java.util.Comparator;

/**
 * Класс реализует функционал обратной сортировки департаментов
 *
 * @author Денис Висков
 * @version 1.0
 * @since 13.01.2020
 */
public class DepAscComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
