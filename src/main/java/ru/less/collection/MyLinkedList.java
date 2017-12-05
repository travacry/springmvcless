package ru.less.collection;

import java.util.Iterator;

/**
 * Created by tr1o on 01.12.17.
 */
public class MyLinkedList<T> implements Iterable<T> {

    private static final Node EMPTY_NODE_FIRST = new Node<>(null, null,null);
    private static final Node EMPTY_NODE_LAST = new Node<>(null, null,null);
    private Node<T> first = EMPTY_NODE_FIRST;
    private Node<T> last = EMPTY_NODE_LAST;
    public final T EMPTY = (T) new Object();
    private int size = 0;
    private Iterator<T> iterator = new IteratorMyLinkedList();

    @Override
    public String toString() {
        Node<T> node = first;
        StringBuilder stringBuilder = new StringBuilder();
        while (node.next != last) {
            node = node.next;
            stringBuilder.append(node.item);
            stringBuilder.append("\n\r");
        }
        return stringBuilder.toString();
    }

    public MyLinkedList() {
    }

    public void add(T item) {
        Node<T> node = new Node<>(item, first, last);
        if (size == 0) {
            first.next = node;
        } else {
            node.prev = last.prev;
            last.prev.next = node;
        }
        last.prev = node;
        size++;
    }

    /**
     * 
     * @param index
     * @return
     */
    public T get(int index) {

        Node<T> node = first;
        int count = 0;
        while (node.next != last) {
            node = node.next;
            if (index == count++) {
                break;
            }
        }
        return (node != first) ? node.item : EMPTY;
    }

    @Override
    public Iterator<T> iterator() {
        return iterator;
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        public Node(E item, Node<E> prev, Node<E> next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

    private class IteratorMyLinkedList implements Iterator<T> {

        private Node<T> cursor;

        public IteratorMyLinkedList() {
            super();
            remove();
        }

        @Override
        public boolean hasNext() {
            boolean result = false;
            if (cursor.next != last) result = true;
            return result;
        }

        @Override
        public T next() {
            Node<T> result = MyLinkedList.EMPTY_NODE_FIRST;
            if (cursor.next != last) {
                result = cursor.next;
                cursor = result;
            }
            return (T) result.item;
        }

        @Override
        public void remove() {
            cursor = first;
        }
    }
}
