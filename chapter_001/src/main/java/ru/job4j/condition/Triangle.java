package ru.job4j.condition;

/**
 * Класс реализует функционал вычисления площади треугольника,периметра,а так же проверку
 * возможно ли построение треугольника с заданными параметрами
 *
 * @author Денис Висков
 * @version 1.1
 * @since 27.11.2019
 */
public class Triangle {
    /**
     * Первая точка
     */
    private Point first;

    /**
     * Вторая точка
     */
    private Point second;

    /**
     * Третья точка
     */
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Метод вычисления периметра по длинам сторон.
     * <p>
     * Формула.
     * <p>
     * (a + b + c) / 2
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return Периметр.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Метод вычисляет площадь треугольника.
     * <p>
     * Формула.
     * <p>
     * √ p *(p - ab) * (p - ac) * (p - bc)
     * <p>
     * где √ - корень квадратный
     *
     * @return Возвращает площадь если треугольник существует и возвращает -1 если не существует.
     */
    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a * b) * (p - a * c) * (p - b * c));
        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     * <p>
     * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
     *
     * @param a Длина от точки a b.
     * @param b Длина от точки a c.
     * @param c Длина от точки b c.
     * @return
     */
    private boolean exist(double a, double c, double b) {
        return a + c > b && c + b > a && a + b > c;
    }
}
