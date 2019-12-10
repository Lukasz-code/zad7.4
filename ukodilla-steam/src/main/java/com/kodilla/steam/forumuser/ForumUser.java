package com.kodilla.steam.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final String user;
    private final int userId;
    private final char sex;
    private final LocalDate birthDate;
    private final int postsNumber;

    public String getUser() {
        return user;
    }

    public int getUserId() {
        return userId;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "user='" + user + '\'' +
                ", userId=" + userId +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postsNumber=" + postsNumber +
                '}';
    }

    public ForumUser(final String user, final int userId, final char sex, final  int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth, final int postsNumber) {
        this.user = user;
        this.userId = userId;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsNumber = postsNumber;



    }
}
