package ru.job4j.tracker;

import java.util.Collections;
import java.util.Comparator;

/**
 * Класс модель Item - описывает бизнес модель заявки
 *
 * @author Денис Висков
 * @version 1.0
 * @since 02.12.2019
 */
public class Item implements Comparator<Item> {
    /**
     * Уникальный ключ
     */
    private String id;

    /**
     * Имя
     */
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compare(Item o1, Item o2) {
        return o1.getId().compareTo(o2.getId());
    }

    @Override
    public Comparator<Item> reversed() {
        return Collections.reverseOrder();
    }
}
