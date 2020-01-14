package ru.job4j.collection;

import java.util.Comparator;

/**
 * Класс реализует функционал обратной сортировки департаментов
 *
 * @author Денис Висков
 * @version 1.0
 * @since 13.01.2020
 */
public class DepAscComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int limit = Math.min(o1.length(), o2.length());
        char[] first = o1.toCharArray();
        char[] second = o2.toCharArray();
        int result = 0;
        for (int i = 0; i < limit; i++) {
            result = Character.compare(second[i], first[i]);
            if (result != 0) {
                return result;
            }
        }
        return o1.length() - o2.length();
    }
}

