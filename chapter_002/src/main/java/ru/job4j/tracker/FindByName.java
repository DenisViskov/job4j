package ru.job4j.tracker;

/**
 * Класс реализует функционал поиска элемента по имени
 *
 * @author Денис Висков
 * @version 1.0
 * @since 10.12.2019
 */
public class FindByName implements UserAction {
    /**
     * @return - имя действия
     */
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    /**
     * Метод реализует поиск элементов с заданным именем
     *
     * @param input   - Объект Input
     * @param tracker - обьект tracker
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter Name: ");
        for (Item item : tracker.findByName(name)) {
            System.out.println("Item ID: " + item.getId() + " Item name: " + item.getName());
        }
        System.out.println("If you see this message it mean your entered Name it was not found");
        System.out.println("Try again");
        return true;
    }
}
