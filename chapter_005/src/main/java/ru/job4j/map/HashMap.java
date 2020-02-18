package ru.job4j.map;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Class has realize HashMap
 *
 * @author Денис Висков
 * @version 1.0
 * @since 18.02.2020
 */
public class HashMap<K, V> {
    private Entry[] table;

    public HashMap() {
        this.table = new Entry[16];
    }

    public boolean insert(K key, V value) {
        Entry element;
        int hash = key.hashCode();
        int index = getIndex(hash, this.table.length);
        if (this.table[index] == null) {
            element = new Entry(key, value, hash);
            this.table[index] = element;
        } else {
            if (this.table[index].hash != hash || !key.equals(this.table[index].key)) {
                this.table[index].next = new Entry(key, value, hash);
            } else {
                return false;
            }
        }
        return true;
    }

    public V get(K key) {
        int index = getIndex(key.hashCode(), this.table.length);
        V result = null;
        if (this.table[index] == null) {
            throw new NullPointerException();
        }
        Iterator<Entry> iterator = this.table[index].iterator();
        while (iterator.hasNext()) {
            Entry element = iterator.next();
            result = element.key.equals(key) ? (V) element.value : null;
        }
        return result;
    }

    public boolean delete(K key) {
        return false;
    }

    private int getIndex(int hash, int size) {
        return hash & (size - 1);
    }

    private static class Entry<K, V> implements Iterable<Entry> {
        private K key;
        private V value;
        private int hash;
        private Entry next;

        public Entry(K key, V value, int hash) {
            this.key = key;
            this.value = value;
            this.hash = hash;
        }

        @Override
        public Iterator iterator() {
            return new Iterator() {
                @Override
                public boolean hasNext() {
                    return next != null ? true : false;
                }

                @Override
                public Entry next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    return next;
                }
            };
        }
    }
}
