package ru.job4j.list;

/**
 * Class has realize searching of circle in liked list
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

    /**
     * Flag for check
     */
    private boolean flag = false;

    public Node(T value) {
        this.value = value;
    }

    /**
     * Method has realize looking for cycle in linked list
     *
     * @param first - first element
     * @return - true or false in dependency of result
     */
    public boolean hasCycle(Node first) {
        Node check = first;
        check.flag = true;
        boolean result = false;
        while (check.next != null) {
            if (!check.next.flag) {
                check = check.next;
                check.flag = true;
            } else {
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
