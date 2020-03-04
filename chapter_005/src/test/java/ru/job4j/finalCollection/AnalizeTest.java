package ru.job4j.finalCollection;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class AnalizeTest {

    private List<Analize.User> previous;

    @Before
    public void setUp() {
        Analize.User first = new Analize.User((int) Math.random(), "Vasya");
        Analize.User second = new Analize.User((int) Math.random(), "Petya");
        Analize.User third = new Analize.User((int) Math.random(), "Oleg");
        Analize.User four = new Analize.User((int) Math.random(), "Alexander");
        Analize.User five = new Analize.User((int) Math.random(), "Pavel");
        previous = List.of(first,
                second,
                third,
                four,
                five);
    }

    @Test
    public void howMuchIsAddedUserDiffTest() {
        List<Analize.User> current = previous;
        current.add(new Analize.User((int) Math.random(), "Ivan"));
        current.add(new Analize.User((int) Math.random(), "Georgy"));
        Analize.Info out = new Analize().diff(previous, current);
        Assert.assertThat(out, Is.is(new Analize.Info(2, 0, 0)));
    }

    @Test
    public void howMuchIsChangedUserDiffTest() {
        List<Analize.User> current = previous;
        current.get(0).setName("newName");
        current.get(2).setName("newName");
        Analize.Info out = new Analize().diff(previous, current);
        Assert.assertThat(out, Is.is(new Analize.Info(0, 2, 0)));
    }

    @Test
    public void howMuchIsDeletedUserDiffTest() {
        List<Analize.User> current = previous;
        current.remove(4);
        current.remove(0);
        Analize.Info out = new Analize().diff(previous, current);
        Assert.assertThat(out, Is.is(new Analize.Info(0, 0, 2)));
    }
}