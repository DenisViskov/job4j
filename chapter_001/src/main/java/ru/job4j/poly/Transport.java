package ru.job4j.poly;

/**
 * Интерфейс реализующий способность ездить
 *
 * @author Денис Висков
 * @version 1.0
 * @since 05.12.2019
 */
public interface Transport {

    /**
     * Способность ехать
     */
    void run();

    /**
     * Количество пассажиров
     *
     * @param count - количество
     */
    void passangers(int count);

    /**
     * Принимает топливо и возвращает цену
     *
     * @param fuel - Топливо
     * @return - цена
     */
    int fillUp(int fuel);
}
