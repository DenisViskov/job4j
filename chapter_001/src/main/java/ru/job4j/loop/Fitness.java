package ru.job4j.loop;

public class Fitness {

    public int calc(int ivan, int nik) {
        int month = 0;
        int first = ivan;
        int second = nik;
        while (first < second) {
            first *= 3;
            second *= 2;
            month++;
        }
        return month;
    }
}
