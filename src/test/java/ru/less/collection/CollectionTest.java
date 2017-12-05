package ru.less.collection;


import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by tr1o on 01.12.17.
 */
public class CollectionTest {

    @Test
    public void arrayContains() {
        List<User> users = new ArrayList<User>();
        users.add(new User("1", "first"));
        users.add(new User("2", "second"));
        assertTrue(users.contains(new User("2", "second")));
    }

    @Test
    public void setAdd() {
        Set<User> users = new HashSet<User>();
        users.add(new User("1", "first"));
        users.add(new User("2", "second"));
        assertEquals(2, users.size());
    }

    @Test
    public void mapPut() {
        Map<User, User> map = new HashMap<>();
        map.put(new User("1", "first"), new User("1", "first"));
        map.put(new User("2", "second"), new User("2", "second"));
        map.put(new User("1", "first"), new User("1", "first"));
        assertTrue(map.containsValue(new User("2", "second")));
        assertTrue(map.containsValue(new User("1", "first")));
    }
}
