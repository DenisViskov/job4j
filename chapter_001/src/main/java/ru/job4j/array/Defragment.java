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
        for (int i = 0; i < array.length; i++) {
            String cell = array[i];
            if (cell == null) {
                int index = i;
                int count = i;
                while (count < array.length) {
                    if (array[count] != null) {
                        array[index] = array[count];
                        array[count] = cell;
                        break;
                    }
                    count++;
                }
            }
            System.out.print(array[i] + " ");
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