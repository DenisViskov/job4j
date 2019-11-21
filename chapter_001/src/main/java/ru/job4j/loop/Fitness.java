package ru.job4j.loop;

public class Fitness {

    public int calc(int ivan, int nik) {
        int month = 0;
        int ivanWorkVar = ivan;
        int nikWorkVar = nik;
        while (ivanWorkVar < nikWorkVar) {
            ivanWorkVar *= 3;
            nikWorkVar *= 2;
            month++;
        }
        return month;
    }
}
