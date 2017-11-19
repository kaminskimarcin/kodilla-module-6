package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeTests() {
        System.out.println("Starting tests...");
    }

    @AfterClass
    public static void afterTests() {
        System.out.println("Tests ended.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Test number: " + testCounter);
    }

    @Test
    public void testWhenPostsEquals0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics();

        //Then
        Assert.assertEquals(0, statisticsCalculator.getAverageNumberOfCommentsOnPost(), 0);
    }

    @Test
    public void testWhenPostsEquals1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        double postsCount = 1000;
        when(statisticsMock.postsCount()).thenReturn(postsCount);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics();

        //Then
        Assert.assertEquals(1000, statisticsCalculator.getAverageNumberOfCommentsOnPost(), 1000);
    }

    @Test
    public void testWhenCommentsNumberEquals0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        double commentsCount = 0;
        when(statisticsMock.postsCount()).thenReturn(commentsCount);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics();

        //Then
        Assert.assertEquals(0, statisticsCalculator.getAverageNumberOfCommentsOnUser(), 0);
    }

    @Test
    public void testWhenIsMoreCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        double commentsCount = 10;
        double postsCount = 20;
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics();
        double result = statisticsCalculator.getAverageNumberOfCommentsOnPost();

        //Then
        Assert.assertEquals(0.5, result, 0.5);
    }

    @Test
    public void testWhenIsMorePostsThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        double commentsCount = 20;
        double postsCount = 10;
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics();
        double result = statisticsCalculator.getAverageNumberOfCommentsOnPost();

        //Then
        Assert.assertEquals(2, result, 2);
    }

    @Test
    public void testWhenNumberOfUsersEquals0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics();
        double result = statisticsCalculator.getAverageNumberOfCommentsOnUser();

        //Then
        Assert.assertEquals(0, result, 0);
    }

    @Test
    public void testWhenNumberOfUsersEquals100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersName = new ArrayList<>();

        for(int i = 0; i < 100; i++) {
            usersName.add("" + i);
        }

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics();
        double result = statisticsCalculator.getAverageNumberOfPostsOnUser();

        //Then
        Assert.assertEquals(0, result, 0);
    }
}
