package ru.job4j.tree;

import java.util.*;

/**
 * Class has realizes simple tree model of data
 *
 * @author Денис Висков
 * @version 1.0
 * @since 20.02.2020
 */
public class Tree<E extends Comparable<E>> implements SimpleTree<E> {
    /**
     * Root node
     */
    private final Node<E> root;

    Tree(final E root) {
        this.root = new Node<>(root);
    }

    /**
     * Method has realizes add new node in root node by the gave parameters
     *
     * @param parent - parent
     * @param child  - child
     * @return - true or false in dependency of result
     */
    @Override
    public boolean add(E parent, E child) {
        boolean rsl = false;
        if (!this.findBy(parent).isPresent() && !this.findBy(child).isPresent()) {
            this.root.children.add(new Node<>(parent));
            this.findBy(parent).get().children.add(new Node<>(child));
            rsl = true;
        } else if (this.findBy(parent).isPresent()) {
            this.findBy(parent).get().children.add(new Node<>(child));
            rsl = true;
        }
        return rsl;
    }

    /**
     * Method has realizes looking for Node in root Node by the gave value in parameters
     *
     * @param value - value
     * @return - Optional Node<E>
     */
    @Override
    public Optional<Node<E>> findBy(E value) {
        Optional<Node<E>> rsl = Optional.empty();
        Queue<Node<E>> data = new LinkedList<>();
        data.offer(this.root);
        while (!data.isEmpty()) {
            Node<E> el = data.poll();
            if (el.value.equals(value)) {
                rsl = Optional.of(el);
                break;
            }
            data.addAll(el.children);
        }
        return rsl;
    }

    /**
     * Method has realizes checking of binary or not our trees
     *
     * @return - true or fals in dependency of result
     */
    public boolean isBinary() {
        boolean result = true;
        Queue<Node<E>> data = new LinkedList<>();
        data.offer(this.root);
        while (!data.isEmpty()) {
            Node<E> element = data.poll();
            if (element.children.size() > 2) {
                result = false;
                break;
            }
            data.addAll(element.children);
        }
        return result;
    }
}
