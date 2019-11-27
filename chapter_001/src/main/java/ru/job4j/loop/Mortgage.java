package ru.job4j.loop;

public class Mortgage {

    public int year(int amount, int salary, double percent) {
        int year = 0;
        double prcnt = percent / 100;
        double summ = amount + (amount * prcnt);
        while (summ > 0) {
            summ = summ - salary;
            summ += summ * prcnt;
            year++;
        }
        return year;
    }
}
