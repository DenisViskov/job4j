package ru.job4j.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringJoiner;

/**
 * Класс реализует ...
 *
 * @author Денис Висков
 * @version 1.0
 * @since 16.03.2020
 */
public class Analizy {

    public void unavailable(String source, String target) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(source));
        PrintWriter writer = new PrintWriter(target);
        StringJoiner line = new StringJoiner(System.lineSeparator());
        while (reader.ready()) {
            reader.lines()
                    .filter(lines -> !lines.equals(""))
                    .forEach(line::add);
        }
    }

    private String builderLog(String line) {
        String[] lines = line.split(System.lineSeparator());
        return null;

    }
}
