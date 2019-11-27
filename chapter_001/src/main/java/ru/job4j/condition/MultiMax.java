package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = 0;
        int range = first >= second ? first : second;
        result = range >= third ? range : third;
        return result;
    }
}
