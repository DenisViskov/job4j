package ru.job4j.loop;

public class Mortgage {

    public int year(int amount, int salary, double percent) {
        int year = 0;
        double onePercent = percent / 100;
        double creditSumm = amount + (amount * onePercent);
        while (creditSumm > 0) {
            creditSumm = creditSumm - salary;
            creditSumm += creditSumm * onePercent;
            year++;
        }
        return year;
    }
}
