package ru.job4j.list;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SimpleArrayListTest {

    private SimpleArrayList<Integer> list;

    @Before
    public void beforeTest() {
        list = new SimpleArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
    }

    @Test
    public void delete() {
        list.delete();
        assertThat(list.get(0), is(2));
        assertThat(list.getSize(), is(2));
        list.delete();
        assertThat(list.get(0), is(1));
        assertThat(list.getSize(), is(1));
    }

    @Test
    public void get() {
        assertThat(list.get(1), is(2));
    }

    @Test
    public void getSize() {
        assertThat(list.getSize(), is(3));
    }
}