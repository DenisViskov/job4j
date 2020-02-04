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
        strings.array = List.of("1", "2", "3", "4", "5").toArray();
        Assert.assertThat(strings.get(2), Is.is("3"));
    }

    @Test
    public void iteratorNext() {
        strings.array = List.of("1", "2", "3", "4", "5").toArray();
        Assert.assertThat(strings.iterator().next(), Is.is("1"));
        Assert.assertThat(strings.iterator().next(), Is.is("2"));
        Assert.assertThat(strings.iterator().next(), Is.is("3"));
        Assert.assertThat(strings.iterator().next(), Is.is("4"));
        Assert.assertThat(strings.iterator().next(), Is.is("5"));
    }

    @Test
    public void iteratorHasNext() {
        strings.array = List.of("1", "2", "3", "4", "5").toArray();
        Assert.assertThat(strings.iterator().hasNext(), Is.is(true));
        Assert.assertThat(strings.iterator().next(), Is.is("1"));
        Assert.assertThat(strings.iterator().hasNext(), Is.is(true));
        Assert.assertThat(strings.iterator().next(), Is.is("2"));
        Assert.assertThat(strings.iterator().hasNext(), Is.is(true));
        Assert.assertThat(strings.iterator().next(), Is.is("3"));
        Assert.assertThat(strings.iterator().hasNext(), Is.is(true));
        Assert.assertThat(strings.iterator().next(), Is.is("4"));
        Assert.assertThat(strings.iterator().hasNext(), Is.is(true));
        Assert.assertThat(strings.iterator().next(), Is.is("5"));
        Assert.assertThat(strings.iterator().hasNext(), Is.is(false));
    }
}