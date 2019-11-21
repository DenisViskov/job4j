package ru.job4j.loop;

public class CheckPrimeNumber {

    public boolean check(int finish) {
        boolean prime = false;
        for (int i = 1; i <= finish; i++) {
            if (finish == 0) {
                break;
            } else if (finish % i == 0 && i != 1 && i != 5) {
                prime = false;
                break;
            } else {
                prime = true;
            }
        }
        return prime;
    }
}
