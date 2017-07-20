package com.kodilla.stream.forum;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(1, "Adam Kowalski", 'M', LocalDate.parse("1980-02-12"), 12));
        forumUsersList.add(new ForumUser(2, "Jan Nowak", 'M', LocalDate.parse("2001-02-12"), 19));
        forumUsersList.add(new ForumUser(3, "Karol Lizak", 'M', LocalDate.parse("1970-02-12"), 0));
        forumUsersList.add(new ForumUser(4, "Dawid Ochojski", 'M', LocalDate.parse("1985-02-12"), 1));
        forumUsersList.add(new ForumUser(5, "Danuta Wiosna", 'F', LocalDate.parse("2002-02-12"), 2));
        forumUsersList.add(new ForumUser(6, "Barbara Kot", 'F', LocalDate.parse("1977-02-12"), 53));
        forumUsersList.add(new ForumUser(7, "Justyna Durczok", 'F', LocalDate.parse("1965-02-12"), 82));
        forumUsersList.add(new ForumUser(8, "Wiktoria Sobczak", 'F', LocalDate.parse("1981-02-12"), 25));
    }

    public List<ForumUser> getForumUsersList() {
        return new ArrayList<>(forumUsersList);
    }
}
