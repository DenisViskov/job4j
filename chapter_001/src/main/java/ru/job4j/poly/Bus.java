package ru.job4j.poly;

/**
 * Класс реализующий функционал автобуса
 *
 * @author Денис Висков
 * @version 1.0
 * @since 05.12.2019
 */
public class Bus implements Transport {

    /**
     * Метод реализует функционал поездки
     */
    @Override
    public void run() {
        System.out.println("Bus runs");
    }

    /**
     * Метод реализует функционал перевозки пассажиров
     *
     * @param count - количество
     */
    @Override
    public void passangers(int count) {
        System.out.println("Count of passangers: " + count);
    }

    /**
     * Метод реализует расчёт стоимости заправки автобуса
     *
     * @param fuel - Топливо
     * @return
     */
    @Override
    public int fillUp(int fuel) {
        int cost = 5;
        return fuel * cost;
    }
}
