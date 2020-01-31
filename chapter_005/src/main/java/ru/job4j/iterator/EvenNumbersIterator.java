package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Class has realize iterator for even numbers
 *
 * @author Денис Висков
 * @version 1.0
 * @since 31.01.2020
 */
public class EvenNumbersIterator {
    /**
     * Numbers
     */
    private int[] numbers;

    /**
     * Index
     */
    private int index = 0;

    public EvenNumbersIterator(int[] numbers) {
        this.numbers = numbers;
    }

    /**
     * Method returns new Iterator wich has realize chack on even
     *
     * @return - new Iterator of even
     */
    public Iterator evenIterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                while (index < numbers.length) {
                    if (isEven(numbers[index])) {
                        return true;
                    } else {
                        index++;
                    }
                }
                return false;
            }

            @Override
            public Integer next() {
                while (!hasNext()) {
                    index++;
                    if (index > numbers.length) {
                        throw new NoSuchElementException();
                    }
                }
                return numbers[index++];
            }

            /**
             * Method is chacking of even numbers
             *
             * @param number - number
             * @return - true or false
             */
            private boolean isEven(int number) {
                return number % 2 == 0 ? true : false;
            }
        };
    }
}
