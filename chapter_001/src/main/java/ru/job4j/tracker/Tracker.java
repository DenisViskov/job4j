package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * Класс реализует функционал обёртки над массивом
 *
 * @author Денис Висков
 * @version 1.1
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
        int index = this.findIndexByID(id);
        if (index != -1) {
            item.setId(this.items[index].getId());
            this.items[index] = item;
            result = true;
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
        int index = this.findIndexByID(id);
        if (index != -1) {
            this.items[index] = null;
            System.arraycopy(this.items, index + 1, this.items, index, this.items.length - (index + 1));
            result = true;
        }
        return result;
    }

    /**
     * Метод реализует возврат нового массива без Null элементов
     *
     * @return - новый массив без Null элементов
     */
    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.position);
    }

    /**
     * Метод реализует возврат всех элементов массива с именами совпадающими в переданном параметре
     *
     * @param key - имя
     * @return - массив с совпадающими именами
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[this.position];
        int index = 0;
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getName().equals(key)) {
                result[index] = this.items[i];
                index++;
            }
        }
        return Arrays.copyOf(result, index);
    }

    /**
     * Метод осуществляет поиск в массиве по заданному ID
     *
     * @param id - ID
     * @return - возвращает Item если элемент найден и Null если не найден
     */
    public Item findById(String id) {
        Item result = null;
        int index = this.findIndexByID(id);
        if (index != -1) {
            result = this.items[index];
        }
        return result;
    }

    /**
     * Метод выполняет поиск индекса по заданному id элемента
     *
     * @param id - id
     * @return - индекс элемента
     */
    private int findIndexByID(String id) {
        int result = -1;
        for (int i = 0; i < this.position; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(id)) {
                result = i;
                break;
            }
        }
        return result;
    }
}
