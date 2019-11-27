package ru.job4j.loop;

/**
 * Класс реализующий функцию рисования
 *
 * @author Денис Висков
 * @version 1.0
 * @since 21.11.19
 */
public class Board {

    /**
     * Метод реализует рисование креста согласно заданным параметрам ширины и высоты
     *
     * @param width  - ширина
     * @param height - высота
     */
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                boolean left = row == cell;
                boolean right = row + cell == width - 1;
                if ((row + cell) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(5, 4);
    }
}