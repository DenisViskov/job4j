package ru.job4j.array;

/**
 * Класс реализует функционал заполнения ячеек массива в начале
 *
 * @author Денис Висков
 * @version 1.0
 * @since 25.11.2019
 */
public class Defragment {

    /**
     * Метод реализует заполнение разбросанных элементов ячеек в массиве в начало
     *
     * @param array - массив
     * @return - дефрагментированный массив
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            if (cell == null) {
                int cellIndex = index;
                int workIndex = index;
                while (workIndex < array.length) {
                    if (array[workIndex] != null) {
                        array[cellIndex] = array[workIndex];
                        array[workIndex] = cell;
                        break;
                    }
                    workIndex++;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}