package ru.job4j.loop;

public class Mortgage {

    public int year(int amount, int salary, double percent) {
        int year = 0;
        double creditPercent = (amount / 100) * percent;
        double creditSumm = creditPercent + amount;
        while (creditSumm > 0) {
            creditSumm = creditSumm - salary;
            year++;
        }
        return year;
    }
}
