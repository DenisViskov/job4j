package ru.job4j.collection;

/**
 * Класс реализует модель данных пользователя
 *
 * @author Денис Висков
 * @version 1.0
 * @since 04.01.2020
 */
public class NewUser {
    /**
     * Имя
     */
    private String name;

    /**
     * Приоритет
     */
    private int priority;

    public NewUser(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "NewUser{" + name + ", " + priority + '}';
    }
}
