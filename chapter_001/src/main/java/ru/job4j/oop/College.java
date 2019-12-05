package ru.job4j.oop;

/**
 * Класс реализует пример реализации полиморфизма
 *
 * @author Денис Висков
 * @version 1.0
 * @since 05.12.2019
 */
public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student student = new Student();
        Object object = new Object();
        student = freshman;
        object = student;
    }
}
