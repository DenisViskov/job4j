package ru.job4j.condition;

public class SqArea {

    public static double square(int p, int k) {
        double oneRatio = 1;
        double firstDo = p / 2;
        double secondDo = oneRatio + k;
        double thirdDo = firstDo / secondDo;
        double result = oneRatio * thirdDo * k * oneRatio;
        return result;
    }

    public static void main(String[] args) {
        double result1 = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
