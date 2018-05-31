package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int idUser;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberPosts;

    public ForumUser(int idUser, String userName, char sex, int year, int month, int day, int numberPosts) {
        this.idUser = idUser;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.numberPosts = numberPosts;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberPosts() {
        return numberPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" + "idUser=" + idUser + ", userName='" + userName + '\'' + ", sex=" + sex + ", dateOfBirth=" + dateOfBirth + ", numberPosts=" + numberPosts + '}';
    }
}
