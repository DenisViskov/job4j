package ru.job4j.oop;

/**
 * Класс реализующий функционал строителя , унаследованный от класса Engineer
 *
 * @author Денис Висков
 * @version 1.0
 * @since 01.12.2019
 */
public class Builder extends Engineer {
    /**
     * Массив инструментов которыми пользуется строитель
     */
    private String[] instruments;

    /**
     * Поставленная задача
     */
    private String task;

    public Builder(int experience, String department, String[] instruments, String task) {
        super(experience, department);
        this.instruments = instruments;
        this.task = task;
    }

    /**
     * Метод вызывает массив инструментов строителя
     *
     * @return - массив инструментов
     */
    public String[] getInstruments() {
        return instruments;
    }

    /**
     * Метод вызывет задачу которую необходимо выполнить строителю
     *
     * @return - задачу
     */
    public String getTask() {
        return task;
    }

    /**
     * Метод выполняет поставленную задачу
     *
     * @param instruments - инструменты которыми работает строитель
     * @param task        - поставленная задача
     */
    private void doneOfTask(String[] instruments, String task) {

    }
}
