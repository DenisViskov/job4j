package ru.job4j.sort;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.tracker.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemSortTest {
    @Test
    public void sortedTest() {
        List<Item> expected = Arrays.asList(new Item("a"),
                new Item("b"),
                new Item("c"));
        List<Item> unsortedList = Arrays.asList(new Item("b"),
                new Item("a"),
                new Item("c"));
        List<Item> out = new ArrayList<>();
        Collections.sort(unsortedList, new ItemSort());
        out = unsortedList;
        Assert.assertEquals(expected.toString(), out.toString());
    }

    @Test
    public void reverseSortedTest() {
        List<Item> expected = Arrays.asList(new Item("c"),
                new Item("b"),
                new Item("a"));
        List<Item> unsortedList = Arrays.asList(new Item("b"),
                new Item("a"),
                new Item("c"));
        List<Item> out = new ArrayList<>();
        Collections.sort(unsortedList, new ItemSort().reversed());
        out = unsortedList;
        Assert.assertEquals(expected.toString(), out.toString());
    }
}
