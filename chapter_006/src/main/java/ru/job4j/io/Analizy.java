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
        String lastWrite = "";
        for (String splitLine : lines) {
            boolean add500 = !lastWrite.endsWith(";") && splitLine.contains("400") || splitLine.contains("500");
            boolean add200 = lastWrite.endsWith(";") && !splitLine.contains("400") && !splitLine.contains("500");
            if (add500) {
                lastWrite = splitLine.replaceFirst("\\d+", "") + ";";
                builder.append(lastWrite);
            } else if (add200) {
                lastWrite = splitLine.replaceFirst("\\d+", "") + System.lineSeparator();
                builder.append(lastWrite);
            } else {
                continue;
            }
        }

        return builder.toString();
    }
}
