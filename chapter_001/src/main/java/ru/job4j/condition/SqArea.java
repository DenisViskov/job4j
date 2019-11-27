package ru.job4j.condition;

public class SqArea {

    public static double square(int p, int k) {
        double ratio = 1;
        double first = p / 2;
        double second = ratio + k;
        double third = first / second;
        double result = ratio * third * k * ratio;
        return result;
    }

    public static void main(String[] args) {
        double result1 = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
