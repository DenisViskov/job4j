package ru.job4j.pojo;

import java.util.Date;

/**
 * Класс реализующий пример использования геттеров и сеттеров
 *
 * @author Денис Висков
 * @version 1.0
 * @since 01.12.2019
 */
public class Student {
    /**
     * Имя
     */
    private String name;

    /**
     * Фамилия
     */
    private String surname;

    /**
     * Отчество
     */
    private String middlename;

    /**
     * Группа
     */
    private int group;

    /**
     * Дата поступления
     */
    private Date income;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Date getIncome() {
        return income;
    }

    public void setIncome(Date income) {
        this.income = income;
    }
}
