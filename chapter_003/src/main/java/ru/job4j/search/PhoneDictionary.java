package ru.job4j.search;

import java.util.ArrayList;

/**
 * Класс реализует функционал справочника
 *
 * @author Денис Висков
 * @version 1.0
 * @since 29.12.2019
 */
public class PhoneDictionary {
    /**
     * Массив людей
     */
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Метод возвращает список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        var result = new ArrayList<Person>();
        for (var i = 0; i < this.persons.size(); i++) {
            boolean condition = this.persons.get(i).getName().contains(key)
                    || this.persons.get(i).getSurname().contains(key)
                    || this.persons.get(i).getPhone().contains(key)
                    || this.persons.get(i).getAddress().contains(key);
            if (condition) {
                Person person = this.persons.get(i);
                result.add(person);
            }
        }
        return result;
    }
}

