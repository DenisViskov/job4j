package ru.job4j.array;

/**
 * Класс осуществляет проверку массива на содержание элементов "true" или "false"
 *
 * @author Денис Висков
 * @version 1.0
 * @since 23.11.19
 */
public class Check {

    /**
     * Метод проверяет что все элементы в массиве являются или true или false.
     *
     * @param data - Массив
     * @return - Либо True либо False
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        boolean etalon = data[0];
        for (int i = 0; i < data.length; i++) {
            if (etalon != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
