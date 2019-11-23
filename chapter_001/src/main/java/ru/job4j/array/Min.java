package ru.job4j.array;

/**
 * Класс реализующий функционал поиска наименьшего элемента в массиве
 *
 * @author Денис Висков
 * @version 1.0
 * @since 23.11.2019
 */
public class Min {

    /**
     * Метод осуществляет поиск в массиве минимального элемента
     *
     * @param array - Массив
     * @return - минимальное значение
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}
