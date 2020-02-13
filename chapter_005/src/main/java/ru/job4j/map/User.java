package ru.job4j.map;

import java.util.Calendar;

/**
 * Class has realize model of data user
 *
 * @author Денис Висков
 * @version 1.0
 * @since 13.02.2020
 */
public class User {
    /**
     * First name
     */
    private String name;

    /**
     * Children
     */
    private int children;

    /**
     * Birthday
     */
    private Calendar birthday;

    public User(String name) {
        this.name = name;
    }
}
