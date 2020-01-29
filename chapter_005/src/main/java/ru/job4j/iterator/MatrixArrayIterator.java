package ru.job4j.iterator;

import java.util.Iterator;

/**
 * Class has realizes functional of Double Array iterator
 *
 * @author Денис Висков
 * @version 1.0
 * @since 29.01.2020
 */
public class MatrixArrayIterator {
    /**
     * values
     */
    private int[][] values;

    /**
     * First index
     */
    private int indexFirst = 0;

    /**
     * Second index
     */
    private int indexSecond = 0;

    public MatrixArrayIterator(int[][] values) {
        this.values = values;
    }

    /**
     * Method has realizes iterator for double array
     *
     * @return - iterator
     */
    public Iterator iteratorForMatrixArray() {
        int[][] work = this.values;
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return indexSecond < work[indexFirst].length
                        && work[indexFirst].length != 1
                        || indexFirst < work.length ? true : false;
            }

            @Override
            public Object next() {
                int result = work[indexFirst][indexSecond++];
                if (indexSecond == work[indexFirst].length && indexFirst != work.length) {
                    indexSecond = 0;
                    indexFirst++;
                }
                return result;
            }
        };
    }
}
