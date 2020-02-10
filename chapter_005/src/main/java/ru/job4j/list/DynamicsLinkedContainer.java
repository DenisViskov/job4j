package ru.job4j.list;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Class has realize Dynamics Linked Container
 *
 * @author Денис Висков
 * @version 1.0
 * @since 09.02.2020
 */
public class DynamicsLinkedContainer<E> implements Iterable<E> {
    /**
     * Size
     */
    private int size;

    /**
     * First element
     */
    private Node<E> first;

    /**
     * Count of changes
     */
    private int modCount = 0;

    /**
     * Method has realize add value to List
     *
     * @param value - value
     */
    public void add(E value) {
        Node<E> newLink = new Node<>(value);
        newLink.next = this.first;
        this.first = newLink;
        this.size++;
        this.modCount++;
    }

    /**
     * Method returns element on index
     *
     * @param index - index
     * @return - E
     */
    public E get(int index) {
        Node<E> result = this.first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.data;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int expectedModCount = modCount;
            Node<E> result = first;

            @Override
            public boolean hasNext() {
                if (expectedModCount == modCount) {
                    return result != null ? true : false;
                }
                throw new ConcurrentModificationException();
            }

            @Override
            public E next() {
                if (hasNext()) {
                    E data = result.data;
                    result = result.next;
                    return data;
                }
                throw new NoSuchElementException();
            }
        };
    }

    /**
     * Class has realize model of data Node
     *
     * @param <E> - element
     */
    private static class Node<E> {
        /**
         * Data
         */
        private E data;

        /**
         * Next element
         */
        private Node<E> next;

        public Node(E data) {
            this.data = data;
        }
    }
}
