package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> resulForumUser = theForum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getDateOfBirth().isBefore(LocalDate.now().minusYears(20)))
                .filter(user -> user.getNumberPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdUser, user -> user));

        resulForumUser.entrySet().stream()
                .map(entry -> entry.getKey()+ ": " + entry.getValue())
                .forEach(System.out::println);
    }
}

