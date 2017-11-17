package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {
    private String name;
    private String realName;
    private ArrayList<ForumPost> posts = new ArrayList<>();
    private LinkedList<ForumComment> comment = new LinkedList<>();

    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }

    public void addPost(String author, String postBody) {
        ForumPost thePost = new ForumPost(postBody, author);
        posts.add(thePost);
    }

    public void addComment(ForumPost thePost, String author, String commentBody) {
        ForumComment theComment = new ForumComment(thePost, commentBody, author);
        comment.add(theComment);
    }

    public int getPostQuantity() {
        return posts.size();
    }

    public int getCommentQuantity() {
        return comment.size();
    }

    public ForumComment getComment(int commentNumber) {
        ForumComment theComment = null;
        if(commentNumber >= 0 && commentNumber < comment.size()) {
            theComment = comment.get(commentNumber);
        }
        return theComment;
    }

    public ForumPost getPost(int postNumber) {
        ForumPost thePost = null;
        if (postNumber >= 0 && postNumber < posts.size()) {
            thePost = posts.get(postNumber);
        }
        return thePost;
    }

    public boolean removePost(ForumPost thePost) {
        boolean result = false;
        if (posts.contains(thePost)) {
            posts.remove(thePost);
            result = true;
        }
        return result;
    }

    public boolean removeComment(ForumComment theComment) {
        boolean result = false;
        if (comment.contains(theComment)) {
            comment.remove(theComment);
            result = true;
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }
}
