package ru.job4j.list;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Class has realizes dynamics container with methods
 *
 * @author Денис Висков
 * @version 1.0
 * @since 07.02.2020
 */
public class DynamicsContainer<E> implements Iterable<E> {
    /**
     * Array of data
     */
    private Object[] container;

    /**
     * Index
     */
    private int index;

    /**
     * Count of changes
     */
    private int countOfChange;

    public DynamicsContainer() {
        this.container = new Object[10];
        this.index = 0;
        this.countOfChange = 0;
    }

    /**
     * Method has realize add of gave value in array of data
     *
     * @param value - value
     */
    public void add(E value) {
        if (index < this.container.length) {
            this.container[index++] = value;
        } else {
            this.container = Arrays.copyOf(this.container, this.container.length + 10);
            this.container[index++] = value;
            this.countOfChange++;
        }
    }

    public E get(int index) {
        if (index < this.container.length && index >= 0) {
            return (E) this.container[index];
        }
        throw new IndexOutOfBoundsException("Index is located behind the side of date");
    }

    @Override
    public Iterator<E> iterator() {
        countOfChange = 0;
        return new Iterator<E>() {
            @Override
            public boolean hasNext() {
                if (countOfChange == 0) {
                    return index < container.length && container[index] != null ?
                            true : false;
                }
                throw new ConcurrentModificationException("Structure of data base was been changed");
            }

            @Override
            public E next() {
                if (hasNext()) {
                    return (E) container[index++];
                }
                throw new NoSuchElementException();
            }
        };
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
