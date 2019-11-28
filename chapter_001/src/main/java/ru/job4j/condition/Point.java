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

    /**
     * Поле объекта. Доступно только объекту
     */
    private int z;

    /**
     * Конструтор, который принимает начальное состояние объекта "точка"
     *
     * @param first  координата x
     * @param second координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Конструктор принимающий 3 параметра для построения треугольника
     *
     * @param x - координата Х
     * @param y - координата У
     * @param z - координата Z
     */
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Метод реализует нахождение расстояния между точками в системе координат с двумя параметрами
     *
     * @param that - Треугольник
     * @return - Расстояние
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * Метод реализует нахождение расстояния между точками в системе координат с тремя параметрами
     *
     * @param that - Треугольник
     * @return - Расстояние
     */
    public double distance3d(Point that) {
        return sqrt(pow(that.x - this.x, 2) + pow(that.y - this.y, 2) + pow(that.z - this.z, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);

    }
}
