package ru.job4j.generic;

import java.util.Iterator;

/**
 * Class has realize universal wrapper for array
 *
 * @author Денис Висков
 * @version 1.0
 * @since 03.02.2020
 */
public class SimpleArray<T> implements Iterable<T> {
    /**
     * Array
     */
    Object[] array;

    /**
     * Index
     */
    int index = 0;

    public SimpleArray(int size) {
        this.array = new Object[size];
    }

    /**
     * Method has realize add element in array
     *
     * @param model - T element
     */
    public void add(T model) {
        this.array[index++] = model;
    }

    /**
     * Method has realize set model in array on the index
     *
     * @param index - index
     * @param model - model
     */
    public void set(int index, T model) {
        this.array[index] = model;
    }

    /**
     * Method has remove element on index and shifts all remaining elements on the one position
     *
     * @param index - index
     */
    public void remove(int index) {

    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
