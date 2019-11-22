package ru.job4j.loop;

public class PrimeNumber {

    public int calc(int finish) {
        int count = 1;
        for (int outter = 2; outter <= finish; outter++) {
            for (int inner = 2; inner < outter; inner++) {
                if (outter % inner == 0) {
                    break;
                } else if (inner == outter - 1) {
                    count++;
                }
            }
        }
        return count;
    }
}