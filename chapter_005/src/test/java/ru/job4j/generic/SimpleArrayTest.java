package ru.job4j.generic;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SimpleArrayTest {
    private SimpleArray<String> strings = new SimpleArray<>(5);

    @Test
    public void add() {
        strings.add("1");
        Assert.assertEquals("1", strings.get(0));
    }

    @Test
    public void set() {
        strings.add("1");
        strings.set(0, "2");
        Assert.assertEquals("2", strings.get(0));
    }

    @Test
    public void remove() {
        strings.array = List.of("1", "2", "3", "4", "5").toArray();
        strings.remove(0);
        Assert.assertThat(strings.array, Is.is(List.of("2", "3", "4", "5").toArray()));
    }

    @Test
    public void get() {
    }

    @Test
    public void iterator() {
    }
}