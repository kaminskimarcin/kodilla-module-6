package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    private double numberOfUsers;
    private double numberOfPosts;
    private double numberOfComment;
    private double averageNumberOfPostsOnUser;
    private double averageNumberOfCommentsOnUser;
    private double averageNumberOfCommentsOnPost;

    private Statistics statistics;

    public StatisticsCalculator(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics() {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComment = statistics.postsCount();
        if (statistics.usersNames().size() != 0) {
            averageNumberOfPostsOnUser = (statistics.postsCount() / statistics.usersNames().size());
        } else {
            averageNumberOfCommentsOnUser = 0;
        }
        if (statistics.usersNames().size() != 0) {
            averageNumberOfCommentsOnUser = (statistics.commentsCount() / statistics.usersNames().size());
        } else {
            averageNumberOfCommentsOnUser = 0;
        }
        if (statistics.postsCount() != 0) {
            averageNumberOfCommentsOnPost = (statistics.commentsCount() / statistics.postsCount());
        } else {
            averageNumberOfCommentsOnPost = 0;
        }
    }


    public void showStatistics() {
        System.out.println("Number of users: " + numberOfUsers);
        System.out.println("Number of posts: " + numberOfPosts);
        System.out.println("Number of comments: " + numberOfComment);
        System.out.println("Average number of posts on user: " + averageNumberOfPostsOnUser);
        System.out.println("Average number of comments on user: " + averageNumberOfCommentsOnUser);
        System.out.println("Average number of comments on post: " + averageNumberOfCommentsOnPost);
    }

    public double getNumberOfUsers() {
        return numberOfUsers;
    }

    public double getNumberOfPosts() {
        return numberOfPosts;
    }

    public double getNumberOfComment() {
        return numberOfComment;
    }

    public double getAverageNumberOfPostsOnUser() {
        return averageNumberOfPostsOnUser;
    }

    public double getAverageNumberOfCommentsOnUser() {
        return averageNumberOfCommentsOnUser;
    }

    public double getAverageNumberOfCommentsOnPost() {
        return averageNumberOfCommentsOnPost;
    }

    public Statistics getStatistics() {
        return statistics;
    }
}
