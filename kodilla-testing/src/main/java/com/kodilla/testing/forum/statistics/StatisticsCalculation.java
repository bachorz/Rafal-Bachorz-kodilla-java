package com.kodilla.testing.forum.statistics;

public class StatisticsCalculation {

  //  private Statistics statistics;

    private int numberOfUser;
    private int numberOfPosts;
    private int numberOfComments;
    public double averageNumberOfPostsPerUser;
    public double averageNumberOfCommentsPerUser;
    public double averageNumberOfCommentsPerPost;


    public void calculateAdvStatistics(Statistics statistics){
        numberOfUser = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if(numberOfUser>0) {
            averageNumberOfPostsPerUser = numberOfPosts /(double) numberOfUser;
        }else{
            averageNumberOfPostsPerUser = 0;
        }

        if(numberOfUser>0) {
            averageNumberOfCommentsPerUser = numberOfComments /(double) numberOfUser;
        }else {
            averageNumberOfCommentsPerUser = 0;
        }

        if(numberOfPosts>0) {
            averageNumberOfCommentsPerPost = numberOfComments /(double) numberOfPosts;
        }else{
            averageNumberOfCommentsPerPost = 0;
        }
    }

    public int getNumberOfUser() {
        return numberOfUser;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

   public void showStatistics(){ System.out.println("Number of users: " + numberOfUser);
        System.out.println("Number of posts: " + numberOfPosts);
        System.out.println("Number of comments: " + numberOfComments);
        System.out.println("Average number of posts per user: " + averageNumberOfPostsPerUser);
        System.out.println("Average number of comments per user: " + averageNumberOfCommentsPerUser);
        System.out.println("Average number of comments per posts: " + numberOfUser);
    }
}
