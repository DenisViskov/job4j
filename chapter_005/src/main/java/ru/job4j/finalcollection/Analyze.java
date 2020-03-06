package ru.job4j.finalcollection;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
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
        return new Info(wasAdded(previous, current), wasChanged(previous, current), wasDeleted(previous, current));
    }

    /**
     * Method has realizes looking for changes of added elements between two lists
     *
     * @param previous - previous
     * @param current  - current
     * @return - integer
     */
    private int wasAdded(List<User> previous, List<User> current) {
        List<Integer> prevID = previous.stream()
                .map(i -> i.id)
                .collect(Collectors.toList());
        List<Integer> currID = current.stream()
                .map(i -> i.id)
                .collect(Collectors.toList());
        int result = 0;
        if (prevID.size() < currID.size()) {
            result = currID.size() - prevID.size();
        } else if (prevID.size() == currID.size()) {
            for (Integer userID : currID) {
                if (!prevID.contains(userID)) {
                    result++;
                }
            }
        }
        return result;
    }

    /**
     * Method has realizes looking for changes of deleted elements between two lists
     *
     * @param previous - previous
     * @param current  - current
     * @return - integer
     */
    private int wasDeleted(List<User> previous, List<User> current) {
        List<Integer> prevID = previous.stream()
                .map(i -> i.id)
                .collect(Collectors.toList());
        List<Integer> currID = current.stream()
                .map(i -> i.id)
                .collect(Collectors.toList());
        int result = 0;
        if (prevID.size() > currID.size()) {
            result = prevID.size() - currID.size();
        } else if (prevID.size() == currID.size()) {
            for (Integer userID : currID) {
                if (!prevID.contains(userID)) {
                    result++;
                }
            }
        }
        return result;
    }

    /**
     * Method has realizes looking for changes of names among elements
     *
     * @param previous - previous
     * @param current  - current
     * @return - integer
     */
    private int wasChanged(List<User> previous, List<User> current) {
        int result = 0;
        Iterator<User> prev = previous.iterator();
        Iterator<User> curr = current.iterator();
        while (prev.hasNext() && curr.hasNext()) {
            User first = prev.next();
            User second = curr.next();
            if (first.id == second.id) {
                result = first.name.equals(second.name) ? result : ++result;
            }
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
