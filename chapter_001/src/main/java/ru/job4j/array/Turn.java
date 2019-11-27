package ru.job4j.array;

/**
 * Класс отвечает за выполнение реверса массива расстанавливая его элементы в обратном порядке
 *
 * @author Денис Висков
 * @version 1.1
 * @since 23.11.19
 */
public class Turn {

    /**
     * Метод выполняет разворот массива расставляя его элементы в обратном порядке
     *
     * @param array - Массив
     * @return - Перевёрнутый массив
     */
    public int[] back(int[] array) {
        int[] result = array;
        int last = result.length - 1;
        int temp = 0;
        for (int i = 0; i < result.length / 2; i++) {
            temp = result[i];
            result[i] = result[last];
            result[last] = temp;
            last--;
        }
        return array;
    }
}
