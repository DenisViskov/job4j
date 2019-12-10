package ru.job4j.tracker;

/**
 * Класс реализует функционал поиска по ID элемента
 *
 * @author Денис Висков
 * @version 1.0
 * @since 10.12.2019
 */
public class FindById implements UserAction {
    /**
     * @return - имя действия
     */
    @Override
    public String name() {
        return "=== Find Item By ID ====";
    }

    /**
     * Метод реализует поиск элемента по его ID
     *
     * @param input   - Объект Input
     * @param tracker - обьект tracker
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter ID: ");
        Item result = tracker.findById(id);
        System.out.println("Item ID: " + result.getId() + " Item name: " + result.getName());
        System.out.println("If you see this message it mean your entered ID it was not found");
        System.out.println("Try again");
        return true;
    }
}
