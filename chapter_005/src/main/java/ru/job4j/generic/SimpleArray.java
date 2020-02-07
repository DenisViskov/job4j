package ru.job4j.generic;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

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
        if (index < this.array.length) {
            this.array[index++] = model;
        } else {
            throw new IndexOutOfBoundsException("There is no space left in the array");
        }
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
        if (index < this.array.length) {
            this.array[index] = null;
            System.arraycopy(this.array, index + 1, this.array, index, this.array.length - (index + 1));
            this.array = Arrays.copyOf(this.array, this.array.length - 1);
            this.index -= 1;
        } else {
            throw new IndexOutOfBoundsException("index is located behind the side of range");
        }
    }

    /**
     * Method returns T element in array on index
     *
     * @param index - index
     * @return - T
     */
    public T get(int index) {
        return (T) this.array[index];
    }

    /**
     * Method returns index of element in array
     *
     * @param element - element
     * @return - index
     */
    public int findIndexOnObject(T element) {
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i].equals(element)) {
                return i;
            }
        }
        throw new NoSuchElementException("Element was not found");
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return index < array.length && array[index] != null ? true : false;
            }

            @Override
            public T next() {
                if (hasNext()) {
                    return (T) array[index++];
                } else {
                    throw new NoSuchElementException();
                }
            }
        };
    }
}
