package ru.job4j.io;

import java.util.Scanner;

/**
 * Класс реализует функционал игры 11 спичек
 *
 * @author Денис Висков
 * @version 1.0
 * @since 04.12.2019
 */
public class Matches {
    public static void main(String[] args) {
        int count = 11;
        Scanner input = new Scanner(System.in);
        do {
            if (count == 0) {
                break;
            }
            System.out.println("Возьмите спички в кол-ве от 1 до 3");
            int first = Integer.valueOf(input.nextLine());
            count -= first;
            String answer = count < 0 || first > 3 ? "Вы пытаетесь взять слишком большое кол-во спичек" : "Спичек на столе: " + count;
            System.out.println(answer);
            int second = Integer.valueOf(input.nextLine());
            count -= second;
            answer = count < 0 || second > 3 ? "Вы пытаетесь взять слишком большое кол-во спичек" : "Спичек на столе: " + count;
            System.out.println(answer);
            if (count < 0) {
                int temp = first > second ? count + first : count + second;
                count += temp;
            } else {

            }
        } while (true);
    }
}
