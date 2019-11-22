package ru.job4j.loop;

public class PrimeNumber {

    public int calc(int finish) {
        int count = 0;
        for (int outter = 2; outter <= finish; outter++) {
            boolean prime = true;
            for (int inner = 2; inner < outter; inner++) {
                if (outter % inner == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                count++;
            }
        }
        return count;
    }
}