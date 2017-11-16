package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Testing Case: begin");
    }

    @After
    public void after() {
        System.out.println("Testing Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Testing suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Testing suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        System.out.println("Testing empty array list...");
        ArrayList<Integer> emptyList = new ArrayList<>();
        ArrayList<Integer> expectedList = new ArrayList<>();
        //when
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(emptyList);
        //then
        Assert.assertEquals(result, expectedList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        System.out.println("Testing filled array list");
        Integer expectedNumber[] = new Integer[]{0, 2, 4, 6, 8};
        ArrayList<Integer> filledList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            filledList.add(i);
        }
        ArrayList<Integer> expectedList = new ArrayList<>(Arrays.asList(expectedNumber));
        //when
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(filledList);
        //then
        Assert.assertEquals(result, expectedList);
    }
}
