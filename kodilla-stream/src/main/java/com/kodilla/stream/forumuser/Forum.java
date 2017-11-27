package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public List<ForumUser> getUserList() {
        forumUsers.add(new ForumUser(0, "Marcin", 'M', 1996, 10, 30, 20));
        forumUsers.add(new ForumUser(1, "Tomek", 'M', 1991, 8, 22, 5));
        forumUsers.add(new ForumUser(2, "Gosia", 'F', 1985, 4, 14, 40));
        forumUsers.add(new ForumUser(3, "Dawid", 'M', 1988, 2, 2, 65));
        forumUsers.add(new ForumUser(4, "Sandra", 'F', 1998, 6, 4, 0));
        forumUsers.add(new ForumUser(5, "Dominika", 'F', 1982, 12, 21, 48));
        forumUsers.add(new ForumUser(6, "Monika", 'F', 1997, 11, 5, 30));

        return new ArrayList<>(forumUsers);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Forum forum = (Forum) o;

        return forumUsers != null ? forumUsers.equals(forum.forumUsers) : forum.forumUsers == null;
    }

    @Override
    public int hashCode() {
        return forumUsers != null ? forumUsers.hashCode() : 0;
    }
}
