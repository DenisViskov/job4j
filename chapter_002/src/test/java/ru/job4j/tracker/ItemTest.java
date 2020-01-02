package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class ItemTest {
    @Test
    public void sortedTest() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Apple"));
        items.add(new Item("Pineapple"));
        items.add(new Item("Bananas"));
        List<Item> expected = Arrays.asList(new Item("Apple"),
                new Item("Bananas"),
                new Item("Pineapple"));
        Collections.sort(items);
        Assert.assertEquals(expected.toString(), items.toString());
    }

    @Test
    public void reverseSortedTest() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Apple"));
        items.add(new Item("Bananas"));
        items.add(new Item("Pineapple"));
        List<Item> expected = Arrays.asList(new Item("Pineapple"),
                new Item("Bananas"),
                new Item("Apple"));
        Collections.sort(items, Collections.reverseOrder());
        Assert.assertEquals(expected.toString(), items.toString());
    }
}
