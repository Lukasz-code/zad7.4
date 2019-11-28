package com.kodilla.testing.forum.statistics;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Test
    public void CountingStatisticsWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int numberOfPosts = 0;
        int numberOfComments = 1000;
        int numberOfUsers = 0;

        when(statisticsMock.usersNames().size()).thenReturn(numberOfUsers);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        CountingStatistics countingStatistics = new CountingStatistics();

        //When

    }

}
