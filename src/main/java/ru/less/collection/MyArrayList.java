package ru.less.collection;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by tr1o on 01.12.17.
 */
public class MyArrayList<T> implements Iterable<T> {

    private static final float UP_SIZE = 1.4f;
    private static final int SIZE = 5;

    private int capacity = 0;
    private int count = 0;
    private Pair[] objects = new Pair[0];
    private IteratorMyArrayList<T> iterator = new IteratorMyArrayList<>();

    public MyArrayList() {
    }

    /**
     * Добавить элемент.
     *
     * @param index
     * @param element
     */
    public void add(int index, T element) {

        iterator.remove();

        if (count >= capacity) {
            capacity += (int) Math.floor(SIZE*UP_SIZE);

            Pair tmp[] = objects;
            objects = new Pair[capacity];
            System.arraycopy(tmp, 0, objects, 0, tmp.length);
        }
        int c = count;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] != null && index == objects[i].getIndex()) {
                c = i;
            }
        }
        if (c == count) count++;
        objects[c] = new Pair<T>(index, element);
    }

    /**
     * Получить элемент.
     *
     * @param index
     * @return
     * @throws NullPointerException
     */
    public T get(int index) throws NullPointerException {

        for (Pair object: objects) {
            if (object != null && index == object.getIndex()) {
                return (T) object.getObj();
            }
        }
        throw new NullPointerException();
    }

    @Override
    public Iterator<T> iterator() {
        return iterator;
    }

    /**
     *
     * @param <E>
     */
    public class Pair<E> {

        private int index;
        private E obj;

        Pair(Integer index, E obj) {
            this.index = index;
            this.obj = obj;
        }

        Integer getIndex() {
            return index;
        }

        E getObj() {
            return obj;
        }
    }

    /**
     * Итератор.
     *
     * @param <E>
     */
    public class IteratorMyArrayList<E> implements Iterator<E> {

        private int position;

        public IteratorMyArrayList() {
            remove();
        }

        @Override
        public void remove() {
            this.position = -1;
        }

        @Override
        public boolean hasNext() {
            if (objects[position + 1] != null) return true;
            else return false;
        }

        @Override
        public E next() {
            if (position >= capacity) throw new NullPointerException();
            return (E) objects[++position].getObj();
        }
    }


}
