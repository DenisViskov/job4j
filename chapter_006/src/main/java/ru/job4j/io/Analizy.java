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
        reader.close();
        String result = builderLog(line.toString());
        writer.println(result);
        writer.close();
    }

    private String builderLog(String line) {
        String[] lines = line.split(System.lineSeparator());
        StringBuilder builder = new StringBuilder();
        for (String splitLine : lines) {
            boolean addFirstLine = builder.length() == 0 && splitLine.contains("400") || splitLine.contains("500");
            boolean addEndTime = builder.length() > 0 && !splitLine.contains("400") && !splitLine.contains("500");
            if (addFirstLine) {
                builder.append(splitLine.replaceFirst("\\d+", "") + ";");
            } else if (addEndTime) {
                builder.append(splitLine.replaceFirst("\\d+", "") + System.lineSeparator());
            } else {
                continue;
            }
        }
        return builder.toString();
    }
}
