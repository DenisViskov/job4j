package ru.job4j.stragery;

/**
 * Класс реализует функциональность квадрата
 *
 * @author Денис Висков
 * @version 1.0
 * @since 09.12.2019
 */
public class Square implements Shape {

    /**
     * Метод отрисовывает квадрат
     *
     * @return - нарисованный квадрат
     */
    @Override
    public String draw() {
        StringBuilder result = new StringBuilder();
        result.append("**********" + '\n');
        result.append("**********" + '\n');
        result.append("**********" + '\n');
        result.append("**********" + '\n');
        return result.toString();
    }
}
