package ru.job4j.pojo;

import java.util.Date;

/**
 * Класс реализующий пример использования геттеров и сеттеров
 *
 * @author Денис Висков
 * @version 1.0
 * @since 01.12.2019
 */
public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan");
        student.setSurname("Petrov");
        student.setMiddlename("Alexandrovich");
        student.setGroup(233);
        student.setIncome(new Date());
        System.out.println(student.getName() + " " + student.getMiddlename() + " " + student.getSurname());
        System.out.println(student.getGroup() + " " + student.getIncome());
    }
}
