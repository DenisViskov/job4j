package ru.job4j.map;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

/**
 * Class has realize HashMap
 *
 * @author Денис Висков
 * @version 1.0
 * @since 18.02.2020
 */
public class HashMap<K, V> {
    private Entry[] table;
    private int index;

    public HashMap() {
        this.table = new Entry[16];
        this.index = 0;
    }

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

    private boolean hasKey(K key) {
        return Arrays.stream(this.table)
                .filter(j -> j != null)
                .flatMap(i -> Stream.of(i.key))
                .anyMatch(k -> k.hashCode() == key.hashCode() ? k.equals(key) : false);
    }

    private int findIndex(K key) {
        if (!this.hasKey(key)) {
            throw new NoSuchElementException();
        }
        return (int) Arrays.stream(this.table)
                .takeWhile(i -> !i.key.equals(key))
                .count();
    }

    private static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
