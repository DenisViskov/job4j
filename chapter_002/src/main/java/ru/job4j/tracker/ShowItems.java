package ru.job4j.tracker;

/**
 * Класс реализует функционал отображения всеъ элементов
 *
 * @author Денис Висков
 * @version 1.0
 * @since 10.12.2019
 */
public class ShowItems implements UserAction {
    /**
     * @return - имя действия
     */
    @Override
    public String name() {
        return "=== Show all items ====";
    }

    /**
     * Метод реализует отображение всех элементов Items
     *
     * @param input   - Объект Input
     * @param tracker - обьект tracker
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] result = tracker.findAll();
        if (result.length == 0) {
            System.out.println("Items list is empty");
        }
        for (int i = 0; i < result.length; i++) {
            if (result[i] != null) {
                System.out.println("Item ID: " + result[i].getId() + " Item name: " + result[i].getName());
            } else {
                System.out.println("Items list is empty");
            }
        }
        return true;
    }
}
