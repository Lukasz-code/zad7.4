package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Test
    public void CountingStatisticsWithMock1() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();


        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        CountingStatistics countingStatistics = new CountingStatistics(statisticsMock);
        countingStatistics.calculateAdvStatistics(statisticsMock);

            //When
            double evenNrCommentsPerPosts = countingStatistics.getEvenNrCommentsPerPosts();
            double EvenNrCommentsPerUsers = countingStatistics.getEvenNrCommentsPerUsers();
            double EvenNrPostsPerUsers = countingStatistics.getEvenNrPostsPerUsers();
            //then
            Assert.assertEquals(0.0, evenNrCommentsPerPosts, 0.0);
            Assert.assertEquals(0.0, EvenNrCommentsPerUsers, 0.0);
            Assert.assertEquals(0.0, EvenNrPostsPerUsers, 0.0);
    }
    @Test
    public void CountingStatisticsWithMock2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();


        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);

        CountingStatistics countingStatistics = new CountingStatistics(statisticsMock);
        countingStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double evenNrCommentsPerPosts = countingStatistics.getEvenNrCommentsPerPosts();
        double EvenNrCommentsPerUsers = countingStatistics.getEvenNrCommentsPerUsers();
        double EvenNrPostsPerUsers = countingStatistics.getEvenNrPostsPerUsers();
        //then
        Assert.assertEquals(0.5, evenNrCommentsPerPosts, 0.0);
        Assert.assertEquals(0.0, EvenNrCommentsPerUsers, 0.0);
        Assert.assertEquals(0.0, EvenNrPostsPerUsers, 0.0);
    }
    @Test
    public void CountingStatisticsWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();


        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        CountingStatistics countingStatistics = new CountingStatistics(statisticsMock);
        countingStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double evenNrCommentsPerPosts = countingStatistics.getEvenNrCommentsPerPosts();
        double EvenNrCommentsPerUsers = countingStatistics.getEvenNrCommentsPerUsers();
        double EvenNrPostsPerUsers = countingStatistics.getEvenNrPostsPerUsers();
        //then
        Assert.assertEquals(2.0, evenNrCommentsPerPosts, 0.0);
        Assert.assertEquals(0.0, EvenNrCommentsPerUsers, 0.0);
        Assert.assertEquals(0.0, EvenNrPostsPerUsers, 0.0);
    }
    @Test
    public void CountingStatisticsWithMock4() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        for (int i = 0; i <100; i++) {
            usersNames.add("random name" + i);
        }


        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        CountingStatistics countingStatistics = new CountingStatistics(statisticsMock);
        countingStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double evenNrCommentsPerPosts = countingStatistics.getEvenNrCommentsPerPosts();
        double EvenNrCommentsPerUsers = countingStatistics.getEvenNrCommentsPerUsers();
        double EvenNrPostsPerUsers = countingStatistics.getEvenNrPostsPerUsers();
        //then
        Assert.assertEquals(0.0, evenNrCommentsPerPosts, 0.0);
        Assert.assertEquals(0.0, EvenNrCommentsPerUsers, 0.0);
        Assert.assertEquals(0.0, EvenNrPostsPerUsers, 0.0);
    }
    @Test
    public void CountingStatisticsWithMock5() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        for (int i = 0; i <100; i++) {
            usersNames.add("random name" + i);
        }


        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(100);

        CountingStatistics countingStatistics = new CountingStatistics(statisticsMock);
        countingStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double evenNrCommentsPerPosts = countingStatistics.getEvenNrCommentsPerPosts();
        double EvenNrCommentsPerUsers = countingStatistics.getEvenNrCommentsPerUsers();
        double EvenNrPostsPerUsers = countingStatistics.getEvenNrPostsPerUsers();
        //then
        Assert.assertEquals(2.0, evenNrCommentsPerPosts, 0.0);
        Assert.assertEquals(1.0, EvenNrCommentsPerUsers, 0.0);
        Assert.assertEquals(0.5, EvenNrPostsPerUsers, 0.0);
    }
}
