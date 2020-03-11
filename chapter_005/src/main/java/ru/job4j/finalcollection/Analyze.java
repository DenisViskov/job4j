package ru.job4j.finalcollection;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Class has realizes analyze about changes in Lists
 *
 * @author Денис Висков
 * @version 1.0
 * @since 04.03.2020
 */
public class Analyze {

    /**
     * Method has realizes analyze of changes by two lists
     *
     * @param previous - previous
     * @param current  - current
     * @return - Info information
     */
    public Info diff(List<User> previous, List<User> current) {
        Info info = new Info(0, 0, 0);
        Map<Integer, String> map = previous.stream()
                .collect(Collectors.toMap(i -> i.id, i -> i.name));
        int size = map.size();
        for (User user : current) {
            map.put(user.id, user.name);
            if (map.size() > size) {
                info.added++;
            } else if (map.size() == size) {
                String name = map.get(user.id);
                if (!name.equals(user.name)) {
                    info.changed++;
                }
            }
        }
        if (map.size() > size) {
            int difference = map.size() - size;
            info.deleted = difference == info.added ? 0 : difference - info.added;
        }
        return null;
    }

    /**
     * Method has realizes looking for changes of added elements between two lists
     *
     * @param first  - previous
     * @param second - current
     * @return - integer
     */
    private int wasAdded(Optional<User> first, Optional<User> second) {
        int result = 0;
        if (first.isPresent() && second.isPresent()) {
            result = first.get().id != second.get().id ? ++result : 0;
        } else {
            result++;
        }
        return result;
    }

    /**
     * Method has realizes looking for changes of deleted elements between two lists
     *
     * @param first  - previous
     * @param second - current
     * @return - integer
     */
    private int wasDeleted(Optional<User> first, Optional<User> second) {
        int result = 0;
        if (first.isPresent() && second.isPresent()) {
            result = first.get().id != second.get().id ? ++result : 0;
        } else {
            result++;
        }
        return result;
    }

    /**
     * Method has realizes looking for changes of names among elements
     *
     * @param first  - previous
     * @param second - current
     * @return - integer
     */
    private int wasChanged(Optional<User> first, Optional<User> second) {
        int result = 0;
        if (first.isPresent() && second.isPresent()) {
            result = first.get().id == second.get().id
                    && !first.get().name.equals(second.get().name) ? ++result : 0;
        }
        return result;
    }

    /**
     * Class has realizes model of data User
     */
    public static class User {
        /**
         * ID of User
         */
        private final int id;

        /**
         * Name of User
         */
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return id == user.id &&
                    name.equals(user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }

    /**
     * Class has realizes model of data Info
     */
    public static class Info {
        /**
         * Added element
         */
        private int added;

        /**
         * Changed element
         */
        private int changed;

        /**
         * Was deleted
         */
        private int deleted;

        public Info(int added, int changed, int deleted) {
            this.added = added;
            this.changed = changed;
            this.deleted = deleted;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return added == info.added
                    && changed == info.changed
                    && deleted == info.deleted;
        }

        @Override
        public int hashCode() {
            return Objects.hash(added, changed, deleted);
        }
    }
}
