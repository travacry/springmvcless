package ru.less.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertTrue;

/**
 * Created by tr1o on 01.12.17.
 */
public class HashMapTest {
    @Test
    public void add() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(5, "test5");
        hashMap.put(1, "test1");
        hashMap.put(5, "test5");

        assertTrue(hashMap.get(5).equals("test5"));
        assertTrue(hashMap.get(1).equals("test1"));
    }

    @Test
    public void entrySet() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(5, "test5");
        hashMap.put(1, "test1");
        hashMap.put(5, "test5");

        Set<Map.Entry<Integer, String>> set = hashMap.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = set.iterator();

        if (iterator.hasNext()) assertTrue(iterator.next().getValue().equals("test1"));
        if (iterator.hasNext()) assertTrue(iterator.next().getValue().equals("test5"));
    }

}
