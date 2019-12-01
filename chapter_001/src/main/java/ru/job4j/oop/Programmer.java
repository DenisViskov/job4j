package ru.job4j.oop;

/**
 * Класс реализующий функционал программиста, унаследованный от класса Engineer
 *
 * @author Денис Висков
 * @version 1.0
 * @since 01.12.2019
 */
public class Programmer extends Engineer {
    /**
     * Язык программирвоания
     */
    private String language;

    /**
     * используемый фреймворк
     */
    private String framework;

    /**
     * Задача которую необходимо решить
     */
    private String task;

    public Programmer(int experience, String department, String language, String framework, String task) {
        super(experience, department);
        this.language = language;
        this.framework = framework;
        this.task = task;
    }

    /**
     * Метод вызывает язык программирования которым владеет объект
     *
     * @return - язык программирования
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Метод вызывает фреймворк с помощью которого решает задачи программист
     *
     * @return - фреймворк
     */
    public String getFramework() {
        return framework;
    }

    /**
     * Метод вызвает задачу которуб необходимо решить
     *
     * @return - задача
     */
    public String getTask() {
        return task;
    }

    /**
     * Метод реализует выполнение задачи программистом
     *
     * @param language  - используемый язык
     * @param framework - фреймворк
     * @param task      - задача
     */
    private void solutionOfTask(String language, String framework, String task) {

    }
}
