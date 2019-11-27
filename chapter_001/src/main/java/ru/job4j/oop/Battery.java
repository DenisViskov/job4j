package ru.job4j.oop;

/**
 * Класс реализует функционал передачи заряда из одной батареи в другую
 *
 * @author Денис Висков
 * @version 1.0
 * @since 28.11.2019
 */
public class Battery {

    /**
     * Заряд
     */
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    /**
     * Метод реализует списание заряда с одного объекта в пользу другого
     *
     * @param another - Другой объект
     */
    public void exchange(Battery another) {
        another.load += this.load;
        this.load -= this.load;
    }

    public static void main(String[] args) {
        Battery first = new Battery(5);
        Battery secod = new Battery(7);
        first.exchange(secod);
    }
}
