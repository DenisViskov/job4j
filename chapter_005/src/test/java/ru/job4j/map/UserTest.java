package ru.job4j.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class UserTest {

    @Test
    public void firstTest() {
        User first = new User("Vasya");
        User second = new User("Vasya");
        Map<User, Object> map = new HashMap<>();
        map.put(first, "String");
        map.put(second, "String");
        System.out.println(map);
        System.out.println(first.hashCode() + " " + second.hashCode());
    }
}