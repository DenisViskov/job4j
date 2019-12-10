package ru.job4j.tracker;

/**
 * Класс реализует функционал удаления элементов
 *
 * @author Денис Висков
 * @version 1.0
 * @since 10.12.2019
 */
public class DeleteItem implements UserAction {
    /**
     * @return - имя действия
     */
    @Override
    public String name() {
        return "=== Delete item ====";
    }

    /**
     * Метод реализует удаление элемента
     *
     * @param input   - Объект Input
     * @param tracker - обьект tracker
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter ID: ");
        if (tracker.delete(id)) {
            System.out.println("Item was been deleted");
        } else {
            System.out.println("Entered ID is not found");
            System.out.println("Try again");
        }
        return true;
    }
}
