package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String username;
    private final char sex;
    private final LocalDate birthday;
    private final int quantityOfPublishedPosts;

    public ForumUser(int id, String username, char sex, int year, int month, int day, int quantityOfPublishedPosts) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.birthday = LocalDate.of(year, month, day);
        this.quantityOfPublishedPosts = quantityOfPublishedPosts;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getQuantityOfPublishedPosts() {
        return quantityOfPublishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", quantityOfPublishedPosts=" + quantityOfPublishedPosts +
                '}';
    }
}
