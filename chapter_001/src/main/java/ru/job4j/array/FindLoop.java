package ru.job4j.array;

/**
 * Класс осуществляющий поиск индекса в массиве с заданным элементом
 *
 * @author Денис Висков
 * @version 1.1
 * @since 23.11.19
 */
public class FindLoop {

    /**
     * Метод осуществляет поиск индекса в массиве с заданным элементом
     *
     * @param data - Массив
     * @param el   - элемент
     * @return - найденный индекс в массиве, иначе возвращает "-1"
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    /**
     * Метод осуществляет поиск элемента в массиве с заданным диапазоном
     *
     * @param data   - Массив
     * @param el     - элемент
     * @param start  - индекс начала поиска
     * @param finish - индекс завершения поиска
     * @return - возвращает индекс найденного элемента, если элемента нет в заданном диапазоне
     * вернёт -1
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rst = i;
            }
        }
        return rst;
    }
}
