//region Description
package com.kodilla.testing.forum.statistics;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticTestSuite{

    private List<String> usersGenerator(int usersQuantity) {
        ArrayList<String> listUsers = new ArrayList<>();
        for (int i = 0; i < usersQuantity; i++) {
            listUsers.add("a2" + 1);
        }
        return listUsers;
    }

    Statistics statisticsMock = mock(Statistics.class);

    @Test
    public void testCalculateUsers0() {
        //Given
        List<String> listMock = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(listMock);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation();
        statisticsCalculation.calculateAdvStatistics(statisticsMock);

        //When
        int usersZero = statisticsCalculation.getNumberOfUser();

        //Then
        Assert.assertEquals(0, usersZero);
    }

    @Test
    public void testCalculatePostsThousand(){
        //Given
        int postsMockThousand = 1000;

        when(statisticsMock.postsCount()).thenReturn(postsMockThousand);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation();
        statisticsCalculation.calculateAdvStatistics(statisticsMock);

        //When
        int postsThousand = statisticsCalculation.getNumberOfPosts();

        //Then
        Assert.assertEquals(1000, postsThousand);
    }

    @Test
    public void testCalculateCommentsZero(){
        //Given
        int commentsMockZero = 0;

        when(statisticsMock.commentsCount()).thenReturn(commentsMockZero);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation();
        statisticsCalculation.calculateAdvStatistics(statisticsMock);

        //When
        int commentsZero = statisticsCalculation.getNumberOfComments();

        //Then
        Assert.assertEquals(0, commentsZero);
    }

    @Test
    public void testCalculatePostsZero(){
        //Given
        int postsMockZero = 0;

        when(statisticsMock.postsCount()).thenReturn(postsMockZero);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation();
        statisticsCalculation.calculateAdvStatistics(statisticsMock);

        //When
        int postsZero = statisticsCalculation.getNumberOfPosts();

        //Then
        Assert.assertEquals(0, postsZero);
    }

    @Test
    public void testCalculateUsersHundred(){
        //Given
        List<String> hundredUsers = usersGenerator(100);

        when(statisticsMock.usersNames()).thenReturn(hundredUsers);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation();
        statisticsCalculation.calculateAdvStatistics(statisticsMock);

        //When
        int usersHundred = statisticsCalculation.getNumberOfUser();

        //Then
        Assert.assertEquals(100, usersHundred);
        System.out.println(usersHundred);
    }

    @Test
    public void testCommentsLessThanPosts(){
        //Given
        int commentsMock = 10;
        int postsMock = 33;

        when(statisticsMock.commentsCount()).thenReturn(commentsMock);
        when(statisticsMock.postsCount()).thenReturn(postsMock);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation();
        statisticsCalculation.calculateAdvStatistics(statisticsMock);

        //When
        int comments = statisticsCalculation.getNumberOfComments();
        int posts = statisticsCalculation.getNumberOfPosts();
        boolean CommentsLessThanPosts = comments < posts;

        //Than
        Assert.assertTrue(CommentsLessThanPosts);
    }

    @Test
    public void testMoreCommentsThanPosts(){
        //Given
        int commentsMock = 55;
        int postsMock = 8;

        when(statisticsMock.commentsCount()).thenReturn(commentsMock);
        when(statisticsMock.postsCount()).thenReturn(postsMock);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation();
        statisticsCalculation.calculateAdvStatistics(statisticsMock);

        //When
        int comments = statisticsCalculation.getNumberOfComments();
        int posts = statisticsCalculation.getNumberOfPosts();
        boolean MoreCommentsThanPosts = comments > posts;

        //Than
        Assert.assertTrue(MoreCommentsThanPosts);
    }

    @Test
    public void testAverageNumberOfPostsPerUser(){
        //Given
        List<String> twentyUsers = usersGenerator(12);
        int postsMock = 24;

        when(statisticsMock.usersNames()).thenReturn(twentyUsers);
        when(statisticsMock.postsCount()).thenReturn(postsMock);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation();
        statisticsCalculation.calculateAdvStatistics(statisticsMock);

        //When
        int users = statisticsCalculation.getNumberOfUser();
        int posts = statisticsCalculation.getNumberOfPosts();
        double resultA = posts/users;
        double resultB = statisticsCalculation.getAverageNumberOfPostsPerUser();

        //Then
        Assert.assertEquals(resultA,resultB,0.0000000001);
        System.out.println(resultA + "," + resultB);
    }

    @Test
    public void testAverageNumberOfCommentsPerUser(){
        //Given
        List<String> fiftyUsers = usersGenerator(100);
        int commentsMock = 33;

        when(statisticsMock.usersNames()).thenReturn(fiftyUsers);
        when(statisticsMock.commentsCount()).thenReturn(commentsMock);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation();
        statisticsCalculation.calculateAdvStatistics(statisticsMock);

        //When
        int users = statisticsCalculation.getNumberOfUser();
        int comments = statisticsCalculation.getNumberOfComments();
        double resultA = comments/(double)users;
        double resultB = statisticsCalculation.getAverageNumberOfCommentsPerUser();

        //Then
        Assert.assertEquals(resultA, resultB,0.0000000001);
        System.out.println(resultA + "," + resultB);
    }

    @Test
    public void testAverageNumberOfCommentsPerPost(){
        //Given
        int commentsMock = 121;
        int postsMock = 55;

        when(statisticsMock.commentsCount()).thenReturn(commentsMock);
        when(statisticsMock.postsCount()).thenReturn(postsMock);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation();
        statisticsCalculation.calculateAdvStatistics(statisticsMock);

        //When
        int comments = statisticsCalculation.getNumberOfComments();
        int posts = statisticsCalculation.getNumberOfPosts();
        double resultA = comments/(double)posts;
        double resultB = statisticsCalculation.getAverageNumberOfCommentsPerPost();

        //Than
        Assert.assertEquals(resultA, resultB,0.0000000001);
        System.out.println(resultA + "," + resultB);
    }
}
//endregion

