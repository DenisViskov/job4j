package ru.job4j.io;

import java.io.*;
import java.util.StringJoiner;

/**
 * Class has realizes reading server log and writing his report
 *
 * @author Денис Висков
 * @version 1.0
 * @since 16.03.2020
 */
public class Analizy {

    /**
     * Method has realizes writing report about work of server
     *
     * @param source - source file path
     * @param target - target file path
     * @throws IOException
     */
    public void unavailable(File source, File target) throws IOException {
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

    /**
     * Method has realizes building log by given parameters about doesn't work time of server
     *
     * @param line - Log of server
     * @return - String doesn't work of time
     */
    private String builderLog(String line) {
        String[] lines = line.split(System.lineSeparator());
        StringBuilder builder = new StringBuilder();
        String lastWrite = "";
        for (String splitLine : lines) {
            boolean add500 = !lastWrite.endsWith(";")
                    && (splitLine.contains("400")
                    || splitLine.contains("500"));
            boolean add200 = lastWrite.endsWith(";")
                    && !splitLine.contains("400")
                    && !splitLine.contains("500");
            if (add500) {
                lastWrite = splitLine.replaceFirst("\\d+", "") + ";";
                builder.append(lastWrite);
            } else if (add200) {
                lastWrite = splitLine.replaceFirst("\\d+", "") + System.lineSeparator();
                builder.append(lastWrite);
            }
        }
        return builder.toString();
    }
}
