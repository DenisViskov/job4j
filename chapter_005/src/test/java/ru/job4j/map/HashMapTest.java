package ru.job4j.map;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class HashMapTest {

    @Test
    public void insertTest() {
        HashMap<Integer, String> map = new HashMap<>();
        map.insert(1,"Privet");
       assertThat(map.get(1),is("Privet"));
    }

    @Test
    public void getTest() {
    }

    @Test
    public void deleteTest() {
    }
}