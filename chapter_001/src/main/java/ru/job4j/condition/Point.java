package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

/**
 * Класс реализует функционал подсчёта дистанции между точками
 *
 * @author Денис Висков
 * @version 1.0
 * @since 27.11.2019
 */
public class Point {
    /**
     * Это поле объекта. Оно доступно только конкретному объекту.
     */
    private int x;

    /**
     * И это поле объекта. Оно доступно только конкретному объекту.
     */
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Метод реализует нахождение расстояния между точками в системе координат
     *
     * @param that - Объект
     * @return - Расстояние
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);

    }
}
