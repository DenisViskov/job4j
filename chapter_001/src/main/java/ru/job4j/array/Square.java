package ru.job4j.array;

/**
 * Класс заполняющий массив числами, возведенными в квадрат.
 *
 * @author Денис Висков
 * @version 1.0
 * @since 23.11.19
 */
public class Square {

    /**
     * Метод осуществляет заполнение массива элементами от 1 до bound возведёнными в квадрат
     *
     * @param bound - Ограничение
     * @return - возвращает массив int
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        int count = 1;
        for (int i = 0; i < rst.length; i++) {
            int pow = count * count;
            rst[i] = pow;
            count++;
        }
        return rst;
    }
}
