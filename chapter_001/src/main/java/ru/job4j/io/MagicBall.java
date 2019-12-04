package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

/**
 * Класс реализует функционал магического шара предсказателя
 *
 * @author Денис Висков
 * @version 1.0
 * @since 04.12.2019
 */
public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать?");
        String answer = input.nextLine();
        int magic = new Random().nextInt(3);
        if (magic == 0) {
            System.out.println("Да");
        } else if (magic == 1) {
            System.out.println("Нет");
        } else {
            System.out.println("Может быть");
        }
    }
}
