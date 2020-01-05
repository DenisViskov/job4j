package ru.job4j.oop;

/**
 * Класс реализует историю о Колобке
 *
 * @author Денис Висков
 * @version 1.0
 * @since 27.11.2019
 */
public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
    }
}
