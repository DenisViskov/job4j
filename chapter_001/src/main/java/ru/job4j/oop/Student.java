package ru.job4j.oop;

/**
 * Класс реализующий функционал исполнения музыки на баяне, а так же пения Студентом
 *
 * @author Денис Висков
 * @version 1.1
 * @since 27.11.2019
 */
public class Student extends Object {

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();
    }

    /**
     * Метод реализует исполнение музыки на баяне
     */
    public void music() {
        System.out.println("Tra tra tra");
    }

    /**
     * Метод реализует исполнение песни
     */
    public void song() {
        System.out.println("I believe I can fly");
    }
}
