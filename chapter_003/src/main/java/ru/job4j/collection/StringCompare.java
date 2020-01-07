package ru.job4j.collection;

import java.util.Comparator;

/**
 * Класс реализует функционал сравнения строк
 *
 * @author Денис Висков
 * @version 1.0
 * @since 04.01.2020
 */
public class StringCompare implements Comparator<String> {
    /**
     * Метод представляет собственную реализацию compare для строк
     *
     * @param left  - строка
     * @param right - строка
     * @return - значение
     */
    @Override
    public int compare(String left, String right) {
        int limit = Math.min(left.length(), right.length());
        char[] first = left.toCharArray();
        char[] second = right.toCharArray();
        int result = 0;
        for (int i = 0; i < limit; i++) {
            result = Character.compare(first[i], second[i]);
            if (result != 0) {
                return result;
            }
        }
        return left.length() - right.length();
    }
}
