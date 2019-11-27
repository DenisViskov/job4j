package ru.job4j.oop;

/**
 * Класс реализует создание объектов
 *
 * @author Денис Висков
 * @version 1.1
 * @since 27.11.2019
 */
public class Cat {

    public static void main(String[] args) {
        Cat peppy = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says " + say);
    }

    /**
     * Метод реализует функционал пения
     *
     * @return - возвращает текст песни
     */
    public String sound() {
        String voice = "may-may";
        return voice;
    }
}
