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
public class Item implements Comparable<Item> {
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
    public String toString() {
        return "Name: " + this.getName();
    }

    @Override
    public int compareTo(Item o) {
        return CharSequence.compare(o.getName(), this.getName());
    }
}
