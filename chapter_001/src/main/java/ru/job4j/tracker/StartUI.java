package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Класс реализует работу пользовательского интерфейса
 *
 * @author Денис Висков
 * @version 1.0
 * @since 05.12.2019
 */
public class StartUI {

    /**
     * Метод реализует пользовательский интерфейс
     *
     * @param input   - Объект Scanner
     * @param tracker - Обьект Tracker
     */
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                this.addNewItem(input, tracker);
            } else if (select == 1) {
                this.showAllItems(input, tracker);
            } else if (select == 2) {
                this.editItem(input, tracker);
            } else if (select == 3) {
                this.deleteItem(input, tracker);
            } else if (select == 4) {
                this.findItemById(input, tracker);
            } else if (select == 5) {
                this.findItemByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    /**
     * Метод реализует отображение поьзовательского меню
     */
    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    /**
     * Метод реализует создание и добавление нового элемента
     *
     * @param input   - Объект Input
     * @param tracker - обьект tracker
     */
    private void addNewItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("New Item was been added");
    }

    /**
     * Метод реализует отображение всех элементов Items
     *
     * @param input   - Объект Input
     * @param tracker - обьект tracker
     */
    private void showAllItems(Input input, Tracker tracker) {
        System.out.println("=== Show all items ====");
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
    }

    /**
     * Метод реализует редактирование элементов
     *
     * @param input   - Объект Input
     * @param tracker - обьект tracker
     */
    private void editItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        String id = input.askStr("Enter ID: ");
        String name = input.askStr("Enter new Name: ");
        Item result = new Item(name);
        if (tracker.replace(id, result)) {
            System.out.println("Edit complete");
        } else {
            System.out.println("Entered ID is not found");
            System.out.println("Try again");
        }
    }

    /**
     * Метод реализует удаление элемента
     *
     * @param input   - Объект Input
     * @param tracker - обьект tracker
     */
    private void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        String id = input.askStr("Enter ID: ");
        if (tracker.delete(id)) {
            System.out.println("Item was been deleted");
        } else {
            System.out.println("Entered ID is not found");
            System.out.println("Try again");
        }
    }

    /**
     * Метод реализует поиск элемента по его ID
     *
     * @param input   - Объект Input
     * @param tracker - обьект tracker
     */
    private void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ====");
        String id = input.askStr("Enter ID: ");
        Item result = tracker.findById(id);
        System.out.println("Item ID: " + result.getId() + " Item name: " + result.getName());
        System.out.println("If you see this message it mean your entered ID it was not found");
        System.out.println("Try again");
    }

    /**
     * Метод реализует поиск элементов с заданным именем
     *
     * @param input   - Объект Input
     * @param tracker - обьект tracker
     */
    private void findItemByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ====");
        String name = input.askStr("Enter Name: ");
        for (Item item : tracker.findByName(name)) {
            System.out.println("Item ID: " + item.getId() + " Item name: " + item.getName());
        }
        System.out.println("If you see this message it mean your entered Name it was not found");
        System.out.println("Try again");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
