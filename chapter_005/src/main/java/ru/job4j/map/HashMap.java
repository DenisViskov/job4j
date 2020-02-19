package ru.job4j.map;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

/**
 * Class has realize HashMap
 *
 * @author Денис Висков
 * @version 1.0
 * @since 18.02.2020
 */
public class HashMap<K, V> implements Iterable<V> {
    /**
     * Table
     */
    private Entry[] table;

    /**
     * Index
     */
    private int index;

    public HashMap() {
        this.table = new Entry[16];
        this.index = 0;
    }

    /**
     * Method has realize add element in table which includes key and value
     *
     * @param key   - key
     * @param value - value
     * @return - true or false in dependency of result
     */
    public boolean insert(K key, V value) {
        boolean result = false;
        if (!this.hasKey(key) && this.index < this.table.length) {
            this.table[this.index++] = new Entry(key, value);
            result = true;
        } else if (this.hasKey(key)) {
            return result;
        } else {
            this.table = Arrays.copyOf(this.table, this.table.length + 16);
            this.table[index++] = new Entry(key, value);
            result = true;
        }
        return result;
    }

    /**
     * Method has realize get of element on the given key in parameters
     *
     * @param key - key
     * @return - V
     */
    public V get(K key) {
        if (!this.hasKey(key)) {
            throw new NoSuchElementException();
        }
        return (V) Arrays.stream(this.table)
                .filter(i -> i.key.equals(key))
                .map(v -> v.value)
                .findFirst()
                .get();
    }

    /**
     * Method has realize delete element in table on the given key
     *
     * @param key - key
     * @return - true or false in dependency of result
     */
    public boolean delete(K key) {
        if (!this.hasKey(key)) {
            return false;
        }
        int position = findIndex(key);
        this.table[position] = null;
        System.arraycopy(this.table, position + 1, this.table, position, this.table.length - (position + 1));
        this.table = Arrays.copyOf(this.table, this.table.length - 1);
        this.index -= 1;
        return true;
    }

    /**
     * Method has realizes checking on the have of key in table
     *
     * @param key - key
     * @return - true or false in dependency of result
     */
    private boolean hasKey(K key) {
        return Arrays.stream(this.table)
                .filter(j -> j != null)
                .flatMap(i -> Stream.of(i.key))
                .anyMatch(k -> k.hashCode() == key.hashCode() ? k.equals(key) : false);
    }

    /**
     * Method has realizes of looking for index in table on the gave Key in parameters
     *
     * @param key - key
     * @return - index
     */
    private int findIndex(K key) {
        if (!this.hasKey(key)) {
            throw new NoSuchElementException();
        }
        return (int) Arrays.stream(this.table)
                .takeWhile(i -> !i.key.equals(key))
                .count();
    }

    @Override
    public Iterator iterator() {
        return new Iterator<V>() {
            /**
             * Position in table
             */
            private int position = 0;

            @Override
            public boolean hasNext() {
                return position < table.length
                        && table[position] != null ? true : false;
            }

            @Override
            public V next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return (V) table[position++].value;
            }
        };
    }

    /**
     * Class has realizes model of data Entry object who's accumulates itself two parameters K and V
     *
     * @param <K> - key
     * @param <V> - value
     */
    private static class Entry<K, V> {
        /**
         * Key
         */
        private K key;

        /**
         * Value
         */
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
