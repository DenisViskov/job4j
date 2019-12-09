package ru.job4j.stragery;

/**
 * Класс реализует функционал треугольника
 *
 * @author Денис Висков
 * @version 1.0
 * @since 09.12.2019
 */
public class Triangle implements Shape {

    /**
     * Метод отрисовывает треугольник
     *
     * @return - нарисованный треугольник
     */
    @Override
    public String draw() {
        StringBuilder result = new StringBuilder();
        result.append("    *    " + '\n');
        result.append("   * *   " + '\n');
        result.append("  *   *  " + '\n');
        result.append(" * * * * " + '\n');
        return result.toString();
    }
}
