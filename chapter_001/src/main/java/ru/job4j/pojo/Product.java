package ru.job4j.pojo;

/**
 * Класс реализующий функционал продуктов
 *
 * @author Денис Висков
 * @version 1.0
 * @since 01.12.2019
 */
public class Product {
    /**
     * Название продукта
     */
    private String name;

    /**
     * Количество
     */
    private int count;

    public Product(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
