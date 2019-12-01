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

        CountingStatistics countingStatistics = new CountingStatistics();
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
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(100);

        CountingStatistics countingStatistics = new CountingStatistics();
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
    public void CountingStatisticsWithMock3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();


        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(0);

        CountingStatistics countingStatistics = new CountingStatistics();
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

        CountingStatistics countingStatistics = new CountingStatistics();
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

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(10);

        CountingStatistics countingStatistics = new CountingStatistics();
        countingStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double evenNrCommentsPerPosts = countingStatistics.getEvenNrCommentsPerPosts();
        double EvenNrCommentsPerUsers = countingStatistics.getEvenNrCommentsPerUsers();
        double EvenNrPostsPerUsers = countingStatistics.getEvenNrPostsPerUsers();
        //Then
        Assert.assertEquals(0.1, evenNrCommentsPerPosts, 0.0);
        Assert.assertEquals(0.0, EvenNrCommentsPerUsers, 0.0);
        Assert.assertEquals(0.0, EvenNrPostsPerUsers, 0.0);
    }
    @Test
    public void CountingStatisticsWithMock6() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(2);
        when(statisticsMock.commentsCount()).thenReturn(10);

        CountingStatistics countingStatistics = new CountingStatistics();
        countingStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double evenNrCommentsPerPosts = countingStatistics.getEvenNrCommentsPerPosts();
        double EvenNrCommentsPerUsers = countingStatistics.getEvenNrCommentsPerUsers();
        double EvenNrPostsPerUsers = countingStatistics.getEvenNrPostsPerUsers();
        //Then
        Assert.assertEquals(5.0, evenNrCommentsPerPosts, 0.0);
        Assert.assertEquals(0.0, EvenNrCommentsPerUsers, 0.0);
        Assert.assertEquals(0.0, EvenNrPostsPerUsers, 0.0);
    }
    @Test
    public void CountingStatisticsWithMock7() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        for (int i = 0; i <100; i++) {
            usersNames.add("random name" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);

        CountingStatistics countingStatistics = new CountingStatistics();
        countingStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double evenNrCommentsPerPosts = countingStatistics.getEvenNrCommentsPerPosts();
        double EvenNrCommentsPerUsers = countingStatistics.getEvenNrCommentsPerUsers();
        double EvenNrPostsPerUsers = countingStatistics.getEvenNrPostsPerUsers();
        //Then
        Assert.assertEquals(0.0, evenNrCommentsPerPosts, 0.0);
        Assert.assertEquals(0.1, EvenNrCommentsPerUsers, 0.0);
        Assert.assertEquals(0.0, EvenNrPostsPerUsers, 0.0);
    }
    @Test
    public void CountingStatisticsWithMock8() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        for (int i = 0; i <2; i++) {
            usersNames.add("random name" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);

        CountingStatistics countingStatistics = new CountingStatistics();
        countingStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double evenNrCommentsPerPosts = countingStatistics.getEvenNrCommentsPerPosts();
        double EvenNrCommentsPerUsers = countingStatistics.getEvenNrCommentsPerUsers();
        double EvenNrPostsPerUsers = countingStatistics.getEvenNrPostsPerUsers();
        //Then
        Assert.assertEquals(0.0, evenNrCommentsPerPosts, 0.0);
        Assert.assertEquals(5.0, EvenNrCommentsPerUsers, 0.0);
        Assert.assertEquals(0.0, EvenNrPostsPerUsers, 0.0);
    }
    @Test
    public void CountingStatisticsWithMock9() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        for (int i = 0; i <2; i++) {
            usersNames.add("random name" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);

        CountingStatistics countingStatistics = new CountingStatistics();
        countingStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double evenNrCommentsPerPosts = countingStatistics.getEvenNrCommentsPerPosts();
        double EvenNrCommentsPerUsers = countingStatistics.getEvenNrCommentsPerUsers();
        double EvenNrPostsPerUsers = countingStatistics.getEvenNrPostsPerUsers();
        //Then
        Assert.assertEquals(0.0, evenNrCommentsPerPosts, 0.0);
        Assert.assertEquals(0.0, EvenNrCommentsPerUsers, 0.0);
        Assert.assertEquals(5.0, EvenNrPostsPerUsers, 0.0);
    }
    @Test
    public void CountingStatisticsWithMock10() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        for (int i = 0; i <40; i++) {
            usersNames.add("random name" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(10);

        CountingStatistics countingStatistics = new CountingStatistics();
        countingStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double evenNrCommentsPerPosts = countingStatistics.getEvenNrCommentsPerPosts();
        double EvenNrCommentsPerUsers = countingStatistics.getEvenNrCommentsPerUsers();
        double EvenNrPostsPerUsers = countingStatistics.getEvenNrPostsPerUsers();
        //Then
        Assert.assertEquals(0.5, evenNrCommentsPerPosts, 0.0);
        Assert.assertEquals(0.25, EvenNrCommentsPerUsers, 0.0);
        Assert.assertEquals(0.5, EvenNrPostsPerUsers, 0.0);
    }
    @Test
    public void CountingStatisticsWithMock11() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        for (int i = 0; i <40; i++) {
            usersNames.add("random name" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(20);

        CountingStatistics countingStatistics = new CountingStatistics();
        countingStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double evenNrCommentsPerPosts = countingStatistics.getEvenNrCommentsPerPosts();
        double EvenNrCommentsPerUsers = countingStatistics.getEvenNrCommentsPerUsers();
        double EvenNrPostsPerUsers = countingStatistics.getEvenNrPostsPerUsers();
        //Then
        Assert.assertEquals(2.0, evenNrCommentsPerPosts, 0.0);
        Assert.assertEquals(0.5, EvenNrCommentsPerUsers, 0.0);
        Assert.assertEquals(0.25, EvenNrPostsPerUsers, 0.0);
    }
    @Test
    public void CountingStatisticsWithMock12() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        for (int i = 0; i <100; i++) {
            usersNames.add("random name" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);

        CountingStatistics countingStatistics = new CountingStatistics();
        countingStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double evenNrCommentsPerPosts = countingStatistics.getEvenNrCommentsPerPosts();
        double EvenNrCommentsPerUsers = countingStatistics.getEvenNrCommentsPerUsers();
        double EvenNrPostsPerUsers = countingStatistics.getEvenNrPostsPerUsers();
        //Then
        Assert.assertEquals(0.0, evenNrCommentsPerPosts, 0.0);
        Assert.assertEquals(0.0, EvenNrCommentsPerUsers, 0.0);
        Assert.assertEquals(0.1, EvenNrPostsPerUsers, 0.0);
    }
}
