package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Class is converter of iterators to iterator
 *
 * @author Денис Висков
 * @version 1.0
 * @since 31.01.2020
 */
public class Converter {
    /**
     * Method has realize converter of iterators to iterator
     *
     * @param it - iterators
     * @return - one iterator
     */
    public Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        return new Iterator<Integer>() {
            Iterator<Integer> current = nextIncludedIterator();
            boolean currentIsNotEmpty = current.hasNext();

            @Override
            public boolean hasNext() {
                if (currentIsNotEmpty) {
                    if (it.hasNext()) {
                        return true;
                    } else {
                        return current.hasNext();
                    }
                } else {
                    return false;
                }
            }

            @Override
            public Integer next() {
                if (current.hasNext()) {
                    return current.next();
                } else {
                    current = nextIncludedIterator();
                }
                return current.next();
            }

            /**
             * Method returns next included iterator
             *
             * @return - iterator
             */
            private Iterator<Integer> nextIncludedIterator() {
                if (it.hasNext()) {
                    return it.next();
                } else {
                    throw new NoSuchElementException();
                }
            }
        };
    }
}
