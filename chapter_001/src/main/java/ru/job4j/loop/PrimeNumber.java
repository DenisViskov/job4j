package ru.job4j.loop;

public class PrimeNumber {

    public int calc(int finish) {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        int count = 0;
        for (int outter = 2; outter <= finish; outter++) {
            boolean isPrime = checkPrimeNumber.check(outter);
            if (isPrime) {
                count++;
            }
        }
        return count;
    }
}