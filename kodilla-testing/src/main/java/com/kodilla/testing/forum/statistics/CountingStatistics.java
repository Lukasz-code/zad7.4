package com.kodilla.testing.forum.statistics;

public class CountingStatistics{

        private double numberOfPosts;
        private double numberOfUsers;
        private double numberOfComments;
        private double evenNrPostsPerUsers;
        private double evenNrCommentsPerUsers;
        private double evenNrCommentsPerPosts;

    public double getNumberOfPosts() {
        return numberOfPosts;
    }

    public double getNumberOfUsers() {
        return numberOfUsers;
    }

    public double getNumberOfComments() {
        return numberOfComments;
    }

    public double getEvenNrPostsPerUsers() {
        return evenNrPostsPerUsers;
    }

    public double getEvenNrCommentsPerUsers() {
        return evenNrCommentsPerUsers;
    }

    public double getEvenNrCommentsPerPosts() {
        return evenNrCommentsPerPosts;
    }

    public void calculateAdvStatistics(Statistics statistics){

        this.numberOfPosts = statistics.postsCount();
        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfComments = statistics.commentsCount();


        if (numberOfUsers == 0) {
            evenNrPostsPerUsers = 0.0;
        } else {
            this.evenNrPostsPerUsers = numberOfPosts / numberOfUsers;
        }

        if (numberOfUsers == 0) {
            evenNrCommentsPerUsers = 0.0;
        } else {
            this.evenNrCommentsPerUsers = numberOfComments / numberOfUsers;
        }

        if (numberOfPosts == 0) {
            evenNrCommentsPerPosts = 0.0;
        } else {
            this.evenNrCommentsPerPosts = numberOfComments / numberOfPosts;
        }
    }
}
