package ru.job4j.io;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringJoiner;

import static org.junit.Assert.assertEquals;

public class AnalizyTest {

    @Test
    public void unavailableTest() throws IOException {
        new Analizy().unavailable("./data/ServerLog.csv","./data/unavailable.csv");
        BufferedReader reader = new BufferedReader(new FileReader("./data/unavailable.csv"));
        StringJoiner out = new StringJoiner(System.lineSeparator());
        reader.lines().forEach(out::add);
        StringJoiner expected = new StringJoiner(System.lineSeparator());
        expected.add("10:57:01;10:59:01");
        expected.add("11:01:02;11:02:02");
        assertEquals(out.toString(), expected.toString());
    }
}