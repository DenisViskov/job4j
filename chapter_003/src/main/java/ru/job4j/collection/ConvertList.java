package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс реализует конвертацию листа массивов в лист
 *
 * @author Денис Висков
 * @version 1.0
 * @since 29.12.2019
 */
public class ConvertList {
    /**
     * Метод реализует конвертацию листа с массивами в один лист
     *
     * @param list - лист
     * @return - лист Integer
     */
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] massive : list) {
            for (Integer result : massive) {
                rsl.add(result);
            }
        }
        return rsl;
    }
}
