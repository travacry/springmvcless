package ru.less.collection;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tr1o on 01.12.17.
 */
public class UserTest {

    /**
     * Проверка рефлексии.
     * x.equals(x)
     */
    @Test
    public void reflexive() {
        User user = new User("1", "2");
        assertEquals(user, user);
    }

    /**
     * Проверка симметрии.
     * x.equals(y) y.equals(x)
     */
    @Test
    public void symmetric() {
        User first = new User("1", "2");
        User second = new User("1", "2");
        assertEquals(first, second);
        assertEquals(second, first);
    }

    /**
     * Проверка транзитивности.
     * x.equals(y) y.equals(z) z.equals(x)
     */
    @Test
    public void transitive() {
        User first = new User("1", "2");
        User second = new User("1", "2");
        User third = new User("1", "2");
        assertEquals(first, second);
        assertEquals(second, third);
        assertEquals(first, third);
    }

    /**
     * Проверка консистентности.
     * multi x.equals(y)
     */
    @Test
    public void consistent() {
        User first = new User("1", "2");
        User second = new User("1", "2");
        for (int i = 0; i < 10; i++) {
            assertEquals(first, second);
        }
    }
}