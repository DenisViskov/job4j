package ru.job4j.map;

import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HashMapTest {

    @Test
    public void insertTest() {
        HashMap<Integer, String> map = new HashMap<>();
        boolean out = map.insert(1, "Privet");
        assertThat(out, is(true));
    }

    @Test
    public void whenWeHaveBehindTheSideOfEndInsertTest() {
        HashMap<Integer, String> map = new HashMap<>();
        boolean out;
        map.insert(1, "Privet");
        map.insert(2, "Privet");
        map.insert(3, "Privet");
        map.insert(4, "Privet");
        map.insert(5, "Privet");
        map.insert(6, "Privet");
        map.insert(7, "Privet");
        map.insert(8, "Privet");
        map.insert(9, "Privet");
        map.insert(10, "Privet");
        map.insert(11, "Privet");
        map.insert(12, "Privet");
        map.insert(13, "Privet");
        map.insert(14, "Privet");
        map.insert(15, "Privet");
        map.insert(16, "Privet");
        out = map.insert(17, "Privet");
        assertThat(out, is(true));
    }

    @Test
    public void getTest() {
        HashMap<Integer, String> map = new HashMap<>();
        boolean whenNot = false;
        map.insert(1, "Privet");
        map.insert(2, "Poka");
        map.insert(3, "Good");
        map.insert(4, "ZZZ");
        assertThat(map.get(3), is("Good"));
        assertThat(map.get(4), is("ZZZ"));
        assertThat(map.get(1), is("Privet"));
        try {
            map.get(5);
        } catch (NoSuchElementException e) {
            whenNot = true;
        } finally {
            assertThat(whenNot, is(true));
        }
    }

    @Test
    public void deleteTest() {
        HashMap<Integer, String> map = new HashMap<>();
        boolean result = false;
        map.insert(1, "Privet");
        map.insert(2, "Poka");
        map.insert(3, "Good");
        map.insert(4, "ZZZ");
        map.delete(1);
        map.delete(2);
        try {
            map.get(1);
        } catch (NoSuchElementException e) {
            result = true;
        } finally {
            assertThat(result, is(true));
            result = false;
        }
        try {
            map.get(2);
        } catch (NoSuchElementException e) {
            result = true;
        } finally {
            assertThat(result, is(true));
        }
    }

    @Test
    public void IteratorTest() {
        HashMap<Integer, String> map = new HashMap<>();
        Iterator iterator = map.iterator();
        map.insert(1, "Privet");
        map.insert(2, "Poka");
        map.insert(3, "Good");
        map.insert(4, "ZZZ");
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(map.get(1)));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(map.get(2)));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(map.get(3)));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(map.get(4)));
        assertThat(iterator.hasNext(), is(false));
    }
}