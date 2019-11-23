package ru.job4j.array;

/**
 * Класс осуществляющий поиск индекса в массиве с заданным элементом
 *
 * @author Денис Висков
 * @version 1.0
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
}
