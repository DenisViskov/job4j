package ru.job4j.oop;

/**
 * Класс абстракция профессий
 *
 * @author Денис Висков
 * @version 1.0
 * @since 01.12.2019
 */
public class Profession {
    /**
     * Имя объекта
     */
    private String name;

    /**
     * Фамилия объекта
     */
    private String surname;

    /**
     * Образование объекта
     */
    private String education;

    /**
     * День рождения объекта
     */
    private String birthday;

    public Profession() {
    }

    public Profession(String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    /**
     * Метод вызывает имя объекта
     *
     * @return - имя
     */
    public String getName() {
        return name;
    }

    /**
     * Метод вызывает фамилию объекта
     *
     * @return - фамилия
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Метод вызывает образование объекта
     *
     * @return - образование
     */
    public String getEducation() {
        return education;
    }

    /**
     * Метод вызывает день рождения объекта
     *
     * @return - день рождения
     */
    public String getBirthday() {
        return birthday;
    }
}
