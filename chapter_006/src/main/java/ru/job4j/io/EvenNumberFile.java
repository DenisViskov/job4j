package ru.job4j.io;

import java.io.FileInputStream;

/**
 * Class has realizes example how to work with try with resources
 *
 * @author Денис Висков
 * @version 1.0
 * @since 16.03.2020
 */
public class EvenNumberFile {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder();
        try (FileInputStream fileReader = new FileInputStream("even.txt")) {
            int read;
            while ((read = fileReader.read()) != -1) {
                text.append((char) read);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String[] lines = text.toString().split(System.lineSeparator());
        for (String line : lines) {
            int value = Integer.valueOf(line);
            boolean result = value % 2 == 0 ? true : false;
            System.out.println(value + ": " + result);
        }
    }
}
