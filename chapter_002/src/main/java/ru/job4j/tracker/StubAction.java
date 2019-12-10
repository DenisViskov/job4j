package ru.job4j.tracker;

/**
 * Класс реализует функционал загрузки действия для проверки выполнения теста
 *
 * @author Денис Висков
 * @version 1.0
 * @since 10.12.2019
 */
public class StubAction implements UserAction {
    /**
     * Проверка выбора пункта меню
     */
    private boolean call = false;

    /**
     * @return - имя
     */
    @Override
    public String name() {
        return "Stub action";
    }

    /**
     * Метод проверяет выбран ли пункт меню
     *
     * @param input   - входящий параметр
     * @param tracker - трекер
     * @return - true или false
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        call = true;
        return false;
    }

    public boolean isCall() {
        return call;
    }
}
