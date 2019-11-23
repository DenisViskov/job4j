package ru.job4j.array;

/**
 * Класс реализующий функционал поиска минимального значения в массиве в заданном диапазоне
 *
 * @author Денис Висков
 * @version 1.0
 * @since 23.11.2019
 */
public class MinDiapason {

    /**
     * Метод реализует поиск минимального значения в заданном диапазоне массива
     *
     * @param array  - Массив
     * @param start  - начало диапазона
     * @param finish - конец диапазона
     * @return - минимальное значение
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i < finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
