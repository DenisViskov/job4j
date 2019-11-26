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
        int indexLeft = 0;
        int indexRight = 0;
        int indexRsl = 0;
        while (indexRsl != rsl.length) {
            if (indexLeft >= left.length) {
                rsl[indexRsl] = right[indexRight];
                indexRight++;
                indexRsl++;
            } else if (indexRight >= right.length) {
                rsl[indexRsl] = left[indexLeft];
                indexRight++;
                indexRsl++;
            } else if (left[indexLeft] <= right[indexRight]) {
                rsl[indexRsl] = left[indexLeft];
                indexLeft++;
                indexRsl++;
            } else {
                rsl[indexRsl] = right[indexRight];
                indexRight++;
                indexRsl++;
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

