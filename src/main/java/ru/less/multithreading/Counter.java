package ru.less.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Счетчик.
 * optimistic locking : состояние не изменилось - запись, изменилось - проверка, запись
 * pessimistic locking : зайти только одной нитью в обьект
 * <p>
 * Created by tr1o on 01.12.17.
 */
public class Counter {

    private int amount;
    /**
     * optimistic locking
     */
//    private AtomicInteger amount;

    /**
     * Монитор на обьект. (mutex)
     *
     * @return
     */
//    public int increase() {
//        amount.getAndIncrement();
//        return amount.get();
//    }
    public synchronized int increase() { // pessimistic locking
        amount++;
        return amount;
    }

    /**
     * Монитор на весь класс.
     */
    public static synchronized void echo() {

    }
}
