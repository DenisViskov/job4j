package ru.job4j.oop;

/**
 * Класс реализубщий функционал инженера, унаследованный от класса Profession
 *
 * @author Денис Висков
 * @version 1.0
 * @since 01.12.2019
 */
public class Engineer extends Profession {
    /**
     * Опыт работы выраженный в годах
     */
    private int experience;

    /**
     * Подразделение где работает врач
     */
    private String department;

    public Engineer(int experience, String department) {
        this.experience = experience;
        this.department = department;
    }

    public Engineer(String name, String surname, String education, String birthday, int experience, String department) {
        super(name, surname, education, birthday);
        this.experience = experience;
        this.department = department;
    }

    /**
     * Метод вызывает опыт работы объекта
     *
     * @return - опыт работы
     */
    public int getExperience() {
        return experience;
    }

    /**
     * Метод вызывает департамент где работает объект
     *
     * @return - департамент
     */
    public String getDepartment() {
        return department;
    }
}
