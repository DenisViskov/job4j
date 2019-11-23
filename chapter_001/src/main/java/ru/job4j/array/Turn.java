package ru.job4j.array;

/**
 * Класс отвечает за выполнение реверса массива расстанавливая его элементы в обратном порядке
 *
 * @author Денис Висков
 * @version 1.0
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
        int lastIndex = result.length - 1;
        int temp = 0;
        for (int i = 0; i < result.length; i++) {
            if (lastIndex > i) {
                temp = result[i];
                result[i] = result[lastIndex];
                result[lastIndex] = temp;
                lastIndex--;
            } else {
                break;
            }
        }
        return array;
    }
}
