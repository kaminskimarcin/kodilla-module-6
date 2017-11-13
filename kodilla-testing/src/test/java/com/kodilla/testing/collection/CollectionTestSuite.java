package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

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
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        System.out.println("Testing empty array list...");
        ArrayList<Integer> emptyList = new ArrayList<>();
        oddNumbersExterminator.exterminate(emptyList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        System.out.println("Testing filled array list");
        ArrayList<Integer> filledList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            filledList.add(i);
        }

        oddNumbersExterminator.exterminate(filledList);
    }
}
