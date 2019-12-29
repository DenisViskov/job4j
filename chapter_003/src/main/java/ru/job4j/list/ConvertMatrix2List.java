package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс реализующий конвертацию массива в лист
 *
 * @author Денис Висков
 * @version 1.0
 * @since 29.12.2019
 */
public class ConvertMatrix2List {
    /**
     * Метод реализует функционал преобразования двумерного массива в лист
     *
     * @param array - массив
     * @return - лист
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }
}
