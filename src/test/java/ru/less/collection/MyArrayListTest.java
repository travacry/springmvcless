package ru.less.collection;

import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

/**
 * Created by tr1o on 01.12.17.
 */
public class MyArrayListTest {
    @Test
    public void addAndGet() throws Exception {
        MyArrayList myArrayList = new MyArrayList<>();
        myArrayList.add(2, "test1");
        myArrayList.add(3, "test2");
        myArrayList.add(4, "test3");
        myArrayList.add(4, "test5");

        assertTrue(myArrayList.get(2).equals("test1"));
        assertTrue(myArrayList.get(4).equals("test5"));
    }

    @Test
    public void iterator() throws Exception {
        MyArrayList myArrayList = new MyArrayList<>();
        Iterator iterator = myArrayList.iterator();
        myArrayList.add(0, "test1");
        myArrayList.add(1, "test2");
        myArrayList.add(2, "test3");

        if (iterator.hasNext()) assertTrue(((String) iterator.next()).equals("test1"));
        if (iterator.hasNext()) assertTrue(((String) iterator.next()).equals("test2"));
        if (iterator.hasNext()) assertTrue(((String) iterator.next()).equals("test3"));
    }
}
