package ru.job4j.tracker;

/**
 * Класс реализует функционал редактирования элементов
 *
 * @author Денис Висков
 * @version 1.0
 * @since 10.12.2019
 */
public class EditItem implements UserAction {
    /**
     * @return - имя действия
     */
    @Override
    public String name() {
        return "=== Edit item ====";
    }

    /**
     * Метод реализует редактирование элементов
     *
     * @param input   - Объект Input
     * @param tracker - обьект tracker
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter ID: ");
        String name = input.askStr("Enter new Name: ");
        Item result = new Item(name);
        if (tracker.replace(id, result)) {
            System.out.println("Edit complete");
        } else {
            System.out.println("Entered ID is not found");
            System.out.println("Try again");
        }
        return true;
    }
}
