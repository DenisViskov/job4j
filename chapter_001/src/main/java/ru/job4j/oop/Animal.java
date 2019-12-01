package ru.job4j.oop;

/**
 * Класс символизирующий абстракцию животного
 *
 * @author Денис Висков
 * @version 1.1
 * @since 01.12.2019
 */
public class Animal {
    /**
     * Имя животного
     */
    public String name;

    public Animal(String name) {
        super();
        this.name = name;
        System.out.println("Load Animal");
    }

    public Animal() {

    }
}
