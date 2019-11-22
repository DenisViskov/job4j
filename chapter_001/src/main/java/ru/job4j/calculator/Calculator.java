package ru.job4j.calculator;

/**
 * Класс выполняющий арифметические операции + - * /.
 *
 * @author Денис Висков
 * @version 1
 * @since 22.11.19
 */
public class Calculator {

    /**
     * Метод выполняет операцию сложения и выводит результат в консоль
     *
     * @param first
     * @param second
     */
    public static void add(int first, int second) {
        int result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    /**
     * Метод выполняет операцию деления и выводит результат в консоль
     *
     * @param first
     * @param second
     */
    public static void div(int first, int second) {
        int result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }

    /**
     * Метод выполняет операцию умножения и выводит результат в консоль
     *
     * @param first
     * @param second
     */
    public static void multiply(int first, int second) {
        int result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    /**
     * Метод выполняет операцию вычитания и выводит результат в консоль
     *
     * @param first
     * @param second
     */
    public static void subtrack(int first, int second) {
        int result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    /**
     * Метод вызывает поочерёдно все методы класса
     *
     * @param args
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtrack(10, 5);
    }
}
