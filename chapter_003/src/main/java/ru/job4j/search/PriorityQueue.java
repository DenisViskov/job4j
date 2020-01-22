package ru.job4j.search;

import java.util.LinkedList;

/**
 * Класс реализует очередь задач
 *
 * @author Денис Висков
 * @version 1.0
 * @since 29.12.2019
 */
public class PriorityQueue {
    /**
     * Задачи
     */
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     *
     * @param task задача
     */
    public void put(Task task) {
        var index = 0;
        for (var element : tasks) {
            index++;
            if (task.getPriority() < element.getPriority()) {
                index--;
            }
        }
        this.tasks.add(index, task);
    }

    /**
     * Метод возвращает первую задачу удаляя её из списка
     *
     * @return - задача
     */
    public Task take() {
        return tasks.remove(0);
    }
}

