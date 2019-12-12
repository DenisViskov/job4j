package ru.job4j.tracker;

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
     * @param input   - объект input
     * @param tracker - трекер
     * @param actions - действия
     */
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.length);
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    /**
     * Метод реализует отображение поьзовательского меню
     *
     * @param actions - действия
     */
    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        UserAction[] actions = new UserAction[]{
                new CreateAction(),
                new ShowItems(),
                new EditItem(),
                new DeleteItem(),
                new FindById(),
                new FindByName()
        };
        new StartUI().init(validate, tracker, actions);
    }
}
