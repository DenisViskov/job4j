package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        double result = (height - 100) * 1.15;
        return result;
    }


    public static double womanWeight(double height) {
        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        double man = manWeight(180);
        double woman = womanWeight(165);
        System.out.println("Man 180 is " + man);
        System.out.println("Woman 165 is " + woman);
    }

}
