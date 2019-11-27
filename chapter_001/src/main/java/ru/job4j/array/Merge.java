package ru.job4j.array;

import java.util.Arrays;

/**
 * Класс реализует функционал добавления элементов двух массивов в третий
 *
 * @author Денис Висков
 * @version 1.0
 * @since 26.11.2019
 */
public class Merge {

    /**
     * Метод реализует добавление элементов массивов в новый массив
     *
     * @param left  - массив
     * @param right - массив
     * @return - отсортированный массив
     */
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int first = 0;
        int second = 0;
        int result = 0;
        while (result != rsl.length) {
            if (first >= left.length) {
                rsl[result] = right[second];
                second++;
                result++;
            } else if (second >= right.length) {
                rsl[result] = left[first];
                second++;
                result++;
            } else if (left[first] <= right[second]) {
                rsl[result] = left[first];
                first++;
                result++;
            } else {
                rsl[result] = right[second];
                second++;
                result++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 3, 5},
                new int[]{2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}

