package ru.job4j.finalcollection;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AnalyzeTest {

    private List<Analyze.User> previous = new ArrayList<>();

    @Before
    public void setUp() {
        Analyze.User first = new Analyze.User((int) (Math.random() * 1000), "Vasya");
        Analyze.User second = new Analyze.User((int) (Math.random() * 1000), "Petya");
        Analyze.User third = new Analyze.User((int) (Math.random() * 1000), "Oleg");
        Analyze.User four = new Analyze.User((int) (Math.random() * 1000), "Alexander");
        Analyze.User five = new Analyze.User((int) (Math.random() * 1000), "Pavel");
        previous.add(first);
        previous.add(second);
        previous.add(third);
        previous.add(four);
        previous.add(five);
    }

    @Test
    public void howMuchIsAddedUserDiffTest() {
        List<Analyze.User> current = new ArrayList<>();
        current.addAll(previous);
        current.add(new Analyze.User((int) (Math.random() * 1000), "Ivan"));
        current.add(new Analyze.User((int) (Math.random() * 1000), "Georgy"));
        Analyze.Info out = new Analyze().diff(previous, current);
        Assert.assertThat(out, Is.is(new Analyze.Info(2, 0, 0)));
    }

    @Test
    public void howMuchIsChangedUserDiffTest() {
        List<Analyze.User> current = new ArrayList<>();
        current.addAll(previous);
        current.get(0).setName("newName");
        current.get(2).setName("newName");
        Analyze.Info out = new Analyze().diff(previous, current);
        Assert.assertThat(out, Is.is(new Analyze.Info(0, 2, 0)));
    }

    @Test
    public void howMuchIsDeletedUserDiffTest() {
        List<Analyze.User> current = new ArrayList<>();
        current.addAll(previous);
        current.remove(4);
        current.remove(0);
        Analyze.Info out = new Analyze().diff(previous, current);
        Assert.assertThat(out, Is.is(new Analyze.Info(0, 0, 2)));
    }

    @Test
    public void addAndRemoveOneElementDiffTest() {
        List<Analyze.User> current = new ArrayList<>();
        current.addAll(previous);
        current.remove(4);
        current.add(new Analyze.User((int) (Math.random() * 1000), "Sergey"));
        Analyze.Info out = new Analyze().diff(previous, current);
        Assert.assertThat(out, Is.is(new Analyze.Info(1, 0, 1)));
    }

    @Test
    public void addAndRemoveAndChangedOneElementDiffTest() {
        List<Analyze.User> current = new ArrayList<>();
        current.addAll(previous);
        current.remove(4);
        current.add(new Analyze.User((int) (Math.random() * 1000), "Sergey"));
        current.get(2).setName("newName");
        Analyze.Info out = new Analyze().diff(previous, current);
        Assert.assertThat(out, Is.is(new Analyze.Info(1, 1, 1)));
    }

    @Test
    public void addTwoAndRemoveAndChangedOneElementDiffTest() {
        List<Analyze.User> current = new ArrayList<>();
        current.addAll(previous);
        current.remove(4);
        current.add(new Analyze.User((int) (Math.random() * 1000), "Sergey"));
        current.add(new Analyze.User((int) (Math.random() * 1000), "Pavel"));
        current.get(2).setName("newName");
        Analyze.Info out = new Analyze().diff(previous, current);
        Assert.assertThat(out, Is.is(new Analyze.Info(2, 1, 1)));
    }
}