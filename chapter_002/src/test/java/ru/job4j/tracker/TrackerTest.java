package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

public class TrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1");
        tracker.add(previous);
        Item next = new Item("test2");
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void whenElementWasDeleted() {
        Tracker tracker = new Tracker();
        Item item = new Item("TV");
        tracker.add(new Item("TV"));
        tracker.add(new Item("Radio"));
        tracker.add(item);
        tracker.add(new Item("Guitar"));
        tracker.add(new Item("Smartphone"));
        tracker.add(new Item("TV"));
        String id = item.getId();
        boolean out = tracker.delete(id);
        Assert.assertTrue(out);
    }

    @Test
    public void whenElementWasNotDeleted() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("TV"));
        tracker.add(new Item("Radio"));
        tracker.add(new Item("Guitar"));
        tracker.add(new Item("Smartphone"));
        tracker.add(new Item("TV"));
        String id = "34534ggfgf";
        boolean out = tracker.delete(id);
        Assert.assertFalse(out);
    }

    @Test
    public void findAllTest() {
        boolean expected = true;
        Tracker tracker = new Tracker();
        tracker.add(new Item("TV"));
        tracker.add(new Item("Radio"));
        ArrayList<Item> out = tracker.findAll();
        for (int i = 0; i < out.size(); i++) {
            if (out.get(i) == null) {
                expected = false;
                break;
            }
        }
        Assert.assertTrue(expected);
    }

    @Test
    public void findByNameTest() {
        boolean expected = true;
        Tracker tracker = new Tracker();
        tracker.add(new Item("TV"));
        tracker.add(new Item("Radio"));
        tracker.add(new Item("Guitar"));
        tracker.add(new Item("Smartphone"));
        tracker.add(new Item("TV"));
        String key = "TV";
        ArrayList<Item> out = tracker.findByName(key);
        if (out.size() == 0) {
            expected = false;
        }
        Assert.assertTrue(expected);
    }

    @Test
    public void notFoundByNameTest() {
        boolean expected = true;
        Tracker tracker = new Tracker();
        tracker.add(new Item("TV"));
        tracker.add(new Item("Radio"));
        tracker.add(new Item("Guitar"));
        tracker.add(new Item("Smartphone"));
        tracker.add(new Item("TV"));
        String key = "Vfgh";
        ArrayList<Item> out = tracker.findByName(key);
        if (out.size() == 0) {
            expected = false;
        }
        Assert.assertFalse(expected);
    }

    @Test
    public void whenfindByIdIsFoundTest() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("TV"));
        tracker.add(new Item("Radio"));
        tracker.add(new Item("Guitar"));
        Item expected = new Item("TV");
        tracker.add(expected);
        String id = expected.getId();
        Item out = tracker.findById(id);
        Assert.assertEquals(out, expected);
    }

    @Test
    public void whenfindByIdIsNotFoundTest() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("TV"));
        tracker.add(new Item("Radio"));
        tracker.add(new Item("Guitar"));
        Item expected = new Item("TV");
        tracker.add(expected);
        String id = "sdfsdfr345";
        Item out = tracker.findById(id);
        assertThat(out, nullValue());
    }
}
