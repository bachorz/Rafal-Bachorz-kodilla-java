package com.kodilla.testing.forum.statistics;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticTestSuite{

    @Test
    public void testCalculateUsers0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
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
        Statistics statisticsMock = mock(Statistics.class);
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
        Statistics statisticsMock = mock(Statistics.class);
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
        Statistics statisticsMock = mock(Statistics.class);
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
        Statistics statisticsMockHundred = mock(Statistics.class);
        List<String> listMockHundred = new ArrayList<>();
        for(int i=0; i<100; i++){
            listMockHundred.add(new String("a2"+1));
        }

        when(statisticsMockHundred.usersNames()).thenReturn(listMockHundred);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation();
        statisticsCalculation.calculateAdvStatistics(statisticsMockHundred);

        //When
        int usersHundred = statisticsCalculation.getNumberOfUser();

        //Then
        Assert.assertEquals(100, usersHundred);
        System.out.println(usersHundred);
    }

    @Test
    public void testCommentsLessThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
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
        Statistics statisticsMock = mock(Statistics.class);
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
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listMock = new ArrayList<>();
        for(int i=0; i<12; i++){
            listMock.add(new String("a2"+i));
        }
        int postsMock = 24;

        when(statisticsMock.usersNames()).thenReturn(listMock);
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
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listMock = new ArrayList<>();
        for(int i=0; i<100; i++){
            listMock.add(new String("a2"+i));
        }
        int commentsMock = 33;

        when(statisticsMock.usersNames()).thenReturn(listMock);
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
        Statistics statisticsMock = mock(Statistics.class);
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

    @Test
    public void testShowStatistics(){

        Statistics statisticsMock = mock(Statistics.class);
        List<String> listMock = new ArrayList<>();
        for(int i=0; i<100; i++){
            listMock.add(new String("a2"+i));
        }
        int postsMock = 55;
        int commentsMock = 33;

        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsMock);
        when(statisticsMock.postsCount()).thenReturn(postsMock);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation();
       statisticsCalculation.calculateAdvStatistics(statisticsMock);

        statisticsCalculation.showStatistics();

    }
}
