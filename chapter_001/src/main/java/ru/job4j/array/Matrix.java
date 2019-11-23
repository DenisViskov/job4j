package ru.job4j.array;

/**
 * Класс реализующий функционал построения таблицы умножения
 *
 * @author Денис Висков
 * @version 1.0
 * @since 23.11.2019
 */
public class Matrix {

    /**
     * Метод реализует заполнение двумерного массива таблицей умножения
     *
     * @param size - размер двумерного массива
     * @return - заполненный массив таблицей умножения
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        int outterCount = 1;
        int innerCount = 1;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = innerCount * outterCount;
                innerCount++;
            }
            innerCount = 1;
            outterCount++;
        }
        return table;
    }
}
