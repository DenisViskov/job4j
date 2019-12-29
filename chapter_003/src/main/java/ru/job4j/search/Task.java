package ru.job4j.search;

/**
 * Класс реализует функционал задачи
 * @author Денис Висков
 * @version 1.0
 * @since 29.12.2019
 */
public class Task {
    /**
     * Описание
     */
    private String desc;

    /**
     * Приоритет
     */
    private int priority;

    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }

    public String getDesc() {
        return desc;
    }

    public int getPriority() {
        return priority;
    }
}
