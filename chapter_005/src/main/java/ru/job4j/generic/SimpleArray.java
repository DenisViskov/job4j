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
    private Object[] array;

    /**
     * Index
     */
    private int index = 0;

    public SimpleArray(int size) {
        this.array = new Object[size];
    }

    /**
     * Method has realize add element in array
     *
     * @param model - T element
     * @return - true or throw IndexOutOfBoundsException
     */
    public boolean add(T model) {
        if (index < this.array.length) {
            this.array[index++] = model;
            return true;
        }
        throw new IndexOutOfBoundsException("There is no space left in the array");
    }

    /**
     * Method has realize set model in array on the position
     *
     * @param position - position
     * @param model    - model
     */
    public void set(int position, T model) {
        if (position < this.index && position >= 0) {
            this.array[position] = model;
        }
    }

    /**
     * Method has remove element on position and shifts all remaining elements on the one position
     *
     * @param position - position
     * @return - true or throw IndexOutOfBoundsException
     */
    public boolean remove(int position) {
        if (position < this.index && position >= 0) {
            this.array[position] = null;
            System.arraycopy(this.array, position + 1, this.array, position, this.array.length - (position + 1));
            this.array = Arrays.copyOf(this.array, this.array.length - 1);
            this.index -= 1;
            return true;
        }
        throw new IndexOutOfBoundsException("position is located behind the side of range");
    }

    /**
     * Method returns T element in array on position
     *
     * @param position - position
     * @return - T or throw IndexOutOfBoundsException
     */
    public T get(int position) {
        if (position < this.index && position >= 0) {
            return (T) this.array[position];
        }
        throw new IndexOutOfBoundsException("position is located behind the side of range");
    }

    /**
     * Method returns index of element in array
     *
     * @param element - element
     * @return - index or else "-1" if element was not found
     */
    public int findIndexOnObject(T element) {
        for (int i = 0; i < this.index; i++) {
            if (this.array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int count = 0;

            @Override
            public boolean hasNext() {
                return count < array.length && array[count] != null ? true : false;
            }

            @Override
            public T next() {
                if (hasNext()) {
                    return (T) array[count++];
                }
                throw new NoSuchElementException();
            }
        };
    }

    public Object[] getArray() {
        return array;
    }
}
