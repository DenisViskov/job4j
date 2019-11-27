package ru.job4j.oop;

/**
 * Класс реализует создание объектов
 *
 * @author Денис Висков
 * @version 1.1
 * @since 27.11.2019
 */
public class Cat {
    /**
     * Еда
     */
    private String food;

    /**
     * Имя
     */
    private String name;

    /**
     * Метод выводи в консоль еду
     */
    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    /**
     * Метод реализует инициализацию переменной food
     *
     * @param meat - Аргумент
     */
    public void eat(String meat) {
        this.food = meat;
    }

    /**
     * Метод реализует инициализацию имени - кличкой
     *
     * @param nick - Аргумент
     */
    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.giveNick("SomeNick");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("BlackCat");
        black.show();
    }
}
