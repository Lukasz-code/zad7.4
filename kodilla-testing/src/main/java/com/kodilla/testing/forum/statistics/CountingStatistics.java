package com.kodilla.testing.forum.statistics;

public class CountingStatistics{

        private int numberOfPosts;
        private int numberOfUsers;
        private int numberOfComments;
        private int evenNrPostsPerUsers;
        private int evenNrCommentsPerUsers;
        private int evenNrCommentsPerPosts;


    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public int getEvenNrPostsPerUsers() {
        return evenNrPostsPerUsers;
    }

    public int getEvenNrCommentsPerUsers() {
        return evenNrCommentsPerUsers;
    }

    public int getEvenNrCommentsPerPosts() {
        return evenNrCommentsPerPosts;
    }

    public void calculateAdvStatistics(Statistics statistics){

        this.numberOfPosts = statistics.postsCount();
        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfComments = statistics.commentsCount();
        this.evenNrPostsPerUsers = numberOfPosts / numberOfUsers;
        this.evenNrCommentsPerUsers = numberOfComments / numberOfUsers;
        this.evenNrCommentsPerPosts = numberOfComments / numberOfPosts;
    }
            }
