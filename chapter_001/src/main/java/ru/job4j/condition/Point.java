package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double pow = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        double result = Math.sqrt(pow);
        return result;
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        double first = distance(0, 0, 2, 3);
        double second = distance(1, 1, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("first (0, 0) to (2, 3) " + first);
        System.out.println("second (1, 1) to (2, 0) " + second);

    }
}
