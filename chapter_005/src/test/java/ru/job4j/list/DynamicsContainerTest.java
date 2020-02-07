package ru.job4j.list;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DynamicsContainerTest {
    DynamicsContainer<Integer> container;

    @Before
    public void setUp(){
        container = new DynamicsContainer<>();
        container.add(1);
        container.add(2);
        container.add(3);
        container.add(4);
        container.add(5);
        container.add(6);
        container.add(7);
        container.add(8);
        container.add(9);
    }

    @Test
    public void add() {
        container.add(10);
        Assert.assertThat(container.get(9), Is.is(10));
        container.add(11);
        Assert.assertThat(container.get(10), Is.is(11));
    }

    @Test
    public void get() {
        Assert.assertThat(container.get(0), Is.is(1));
        Assert.assertThat(container.get(4), Is.is(5));
        Assert.assertThat(container.get(7), Is.is(8));
    }
}