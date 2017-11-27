package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {4, 3, 3, 4, 5, 6, 7, 3, 4, 6, 5, 4, 3, 5, 6, 8, 4, 6, 4, 5, 6};

        //When

        OptionalDouble result = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(4.809523809523809, result.getAsDouble(), 0);
    }
}
