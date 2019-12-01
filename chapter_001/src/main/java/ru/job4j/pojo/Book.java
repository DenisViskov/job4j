package ru.job4j.pojo;

/**
 * Класс реализующий пример работы массивов и моделей
 *
 * @author Денис Висков
 * @version 1.0
 * @since 01.12.2019
 */
public class Book {
    /**
     * Название книги
     */
    private String name;

    /**
     * Количество страниц
     */
    private int count;

    public Book(String name, int count) {
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
