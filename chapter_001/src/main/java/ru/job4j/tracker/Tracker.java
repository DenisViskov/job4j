package ru.job4j.tracker;

import java.util.Random;

/**
 * Класс реализует функционал обёртки над массивом
 *
 * @author Денис Висков
 * @version 1.0
 * @since 02.12.2019
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод выполняет замену элемента в массиве по его ID
     * Возвращает true в случае положительного результата замены и false в противоположном случае
     *
     * @param id   - Id
     * @param item - Item
     * @return - true или false
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(id)) {
                this.items[i] = item;
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод выполняет удаление элемента в ячейке по его ID и выполняет смещение элементов на одну ячейку влево
     * Вернёт true или false в зависимости от того выполнена операция или нет
     *
     * @param id - ID элемента
     * @return true или false
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(id)) {
                this.items[i] = null;
                System.arraycopy(this.items, i + 1, this.items, i, this.items.length - (i + 1));
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод реализует возврат нового массива без Null элементов
     *
     * @return - новый массив без Null элементов
     */
    public Item[] findAll() {
        int index = 0;
        while (this.items[index] != null) {
            index++;
        }
        Item[] result = new Item[index];
        for (int i = 0; i < index; i++) {
            result[i] = this.items[i];
        }
        return result;
    }

    /**
     * Метод реализует возврат всех элементов массива с именами совпадающими в переданном параметре
     *
     * @param key - имя
     * @return - массив с совпадающими именами
     */
    public Item[] findByName(String key) {
        int count = 0;
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null && this.items[i].getName().equals(key)) {
                count++;
            }
        }
        Item[] result = new Item[count];
        int index = 0;
        for (Item item : this.items) {
            if (item != null && item.getName().equals(key)) {
                result[index] = item;
                index++;
            }
        }
        return result;
    }

    /**
     * Метод осуществляет поиск в массиве по заданному ID
     *
     * @param id - ID
     * @return - возвращает Item если элемент найден и Null если не найден
     */
    public Item findById(String id) {
        Item result = null;
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(id)) {
                result = this.items[i];
                break;
            }
        }
        return result;
    }
}
