package ru.job4j.finalCollection;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Денис Висков
 * @version 1.0
 * @since 04.03.2020
 */
public class Analize {

    public Info diff(List<User> previous, List<User> current) {
        return new Info(wasAdded(previous, current), wasChanged(previous, current), wasDeleted(previous, current));
    }

    private int wasAdded(List<User> previous, List<User> current) {
        int result = current.size() - previous.size();
        return result >= 0 ? result : 0;
    }

    private int wasDeleted(List<User> previous, List<User> current) {
        int result = previous.size() - current.size();
        return result >= 0 ? result : 0;
    }

    private int wasChanged(List<User> previous, List<User> current) {

    }

    public static class User {
        private final int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Info {
        private int added;
        private int changed;
        private int deleted;

        public Info(int added, int changed, int deleted) {
            this.added = added;
            this.changed = changed;
            this.deleted = deleted;
        }
    }
}
