package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = 0;
        int maxBetweenFirstAndSecond = first >= second ? first : second;
        if (maxBetweenFirstAndSecond >= third) {
            result = maxBetweenFirstAndSecond;
        } else {
            result = third;
        }
        return result;
    }
}
