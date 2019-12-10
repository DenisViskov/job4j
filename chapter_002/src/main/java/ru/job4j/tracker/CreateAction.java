package ru.job4j.tracker;

/**
 * Класс реализует функционал добавления нового элемента
 *
 * @author Денис Висков
 * @version 1.0
 * @since 10.12.2019
 */
public class CreateAction implements UserAction {
    /**
     * @return - имя действия
     */
    @Override
    public String name() {
        return "=== Create a new Item ====";
    }

    /**
     * Метод реализует создание и добавление нового элемента
     *
     * @param input   - Объект Input
     * @param tracker - обьект tracker
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("New Item was been added");
        return true;
    }
}
