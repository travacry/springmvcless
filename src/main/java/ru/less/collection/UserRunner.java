package ru.less.collection;

import java.util.*;

/**
 * Created by tr1o on 01.12.17.
 */
public class UserRunner {
    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        users.add(new User("1", "first"));
        users.add(new User("2", "second"));
        users.add(new User("1", "first"));

        for (User user: users) {
            System.out.println(user);
        }

        Map<String, User> users_ = new HashMap<>();
        users_.put("f1", new User("1", "first"));
        users_.put("f2", new User("1", "second"));
        users_.put("f3", new User("1", "first"));

        for (Map.Entry user: users_.entrySet()) {
            System.out.println(user);
        }
    }
}
