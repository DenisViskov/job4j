package ru.job4j.collection;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * Класс реализует модель дынных пользователя
 *
 * @author Денис Висков
 * @version 1.0
 * @since 02.01.2020
 */
public class User implements Comparable {
    /**
     * Имя
     */
    private String name;

    /**
     * Возраст
     */
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age
                && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(@NotNull Object o) {
        User user = (User) o;
        int result = this.name.compareTo(user.name);
        if (result == 0) {
            result = Integer.valueOf(this.age).compareTo(Integer.valueOf(user.age));
        }
        return result;
    }
}
