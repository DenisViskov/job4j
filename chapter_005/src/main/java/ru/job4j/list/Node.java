package ru.job4j.list;

/**
 * Class has realize seraching of circle in liked list
 *
 * @author Денис Висков
 * @version 1.0
 * @since 11.02.2020
 */
public class Node<T> {
    /**
     * Value
     */
    private T value;

    /**
     * Next element
     */
    private Node<T> next;

    public Node(T value) {
        this.value = value;
    }

    /**
     * Method has realize looking for cyrcle in linked list
     *
     * @param first - first element
     * @return - true or false in dependency of result
     */
    public boolean hasCycle(Node first) {
        Node check = first;
        boolean result = false;
        while (check != null) {
            check = check.next;
            if (check == first) {
                result = true;
                break;
            }
        }
        return result;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
