package ru.job4j.sort;

import ru.job4j.tracker.Item;

import java.util.Collections;
import java.util.Comparator;

/**
 * Класс реализующий простую и обратную сортировку Item
 *
 * @author Денис Висков
 * @version 1.0
 * @since 02.01.2020
 */
public class ItemSort implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public Comparator<Item> reversed() {
        return Collections.reverseOrder(this);
    }
}
