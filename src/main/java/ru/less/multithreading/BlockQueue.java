package ru.less.multithreading;

import java.util.LinkedList;

/**
 * Блокирущая очередь.
 * Created by tr1o on 01.12.17.
 */
public class BlockQueue<T> {

    /**
     * Не синхронизирована. Гарантий автономности нет.
     */
    public final LinkedList<T> queue = new LinkedList<>();

    public void push(final T t) {
        /*
         * в качесте лока - queue
         */
        synchronized (queue) { // лок
            queue.add(t);
            queue.notifyAll(); // ждущим - проснуться
        }
    }

    public T poll() {
        synchronized (queue) { // здесь лок
            while (queue.isEmpty()) {
                try {
                    // лок откывается
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return queue.remove();
        }
    }
}
