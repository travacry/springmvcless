package ru.less.collection;

import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertTrue;

/**
 * Created by tr1o on 01.12.17.
 */
public class MyLinkedListTest {
    @Test
    public void addAndGet() throws Exception {
        MyLinkedList myLinkedList = new MyLinkedList<>();
        myLinkedList.add("test8");
        myLinkedList.add("test2");
        myLinkedList.add("test7");
        myLinkedList.add("test4");

        assertTrue(myLinkedList.get(0).equals("test8"));
        assertTrue(myLinkedList.get(2).equals("test7"));
    }

    @Test
    public void iterator() throws Exception {
        MyLinkedList myLinkedList = new MyLinkedList<>();
        Iterator iterator = myLinkedList.iterator();
        myLinkedList.add("test8");
        myLinkedList.add("test2");
        myLinkedList.add("test7");
        myLinkedList.add("test4");

        if (iterator.hasNext()) assertTrue(((String) iterator.next()).equals("test8"));
        if (iterator.hasNext()) assertTrue(((String) iterator.next()).equals("test2"));
        if (iterator.hasNext()) assertTrue(((String) iterator.next()).equals("test7"));
    }

}
