package com.kodilla.stream;

import com.kodilla.stream.forum.Forum;
import com.kodilla.stream.forum.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class ForumMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, Object> mapOfForumUsers = forum.getForumUsersList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().getYear() < 1997)
                .filter(forumUser -> forumUser.getPostsAmount() > 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        mapOfForumUsers.entrySet().stream()
                .forEach(System.out::println);
    }
}
