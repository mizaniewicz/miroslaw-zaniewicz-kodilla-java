package com.kodilla.testing.forum.statistics;

import java.util.List;

/**
 * Created by mizan on 18.07.2017.
 */
public interface Statistics {
    List<String> usersNames(); // list of users names
    int postsCount();          // total quantity of forum posts
    int commentsCount();       // total quantity of forum comments
}
