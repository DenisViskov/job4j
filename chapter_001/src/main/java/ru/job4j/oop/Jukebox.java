package ru.job4j.oop;

/**
 * Класс реализующий функционал исполнения песен
 *
 * @author Денис Висков
 * @version 1.0
 * @since 27.11.2019
 */
public class Jukebox {

    /**
     * Метод реализует исполнение песен и выводи результат в консоль
     *
     * @param position - Позиция
     */
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox somebody = new Jukebox();
        somebody.music(1);
        somebody.music(2);
        somebody.music(3);
    }
}
