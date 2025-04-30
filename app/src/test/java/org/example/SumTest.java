package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class SumTest
{
    Sum sum;

    @BeforeEach
    void setUp()
    {
        sum = new Sum();

    }

    @Test
    void SumLoopTest1()
    {
        int[] arr = new int[0];
        assertEquals(sum.sumLoop(arr), 0);

    }

    @Test
    void SumLoopTest2()
    {
        int[] arr = {1, 1, 1, 1, 1};
        assertEquals(sum.sumLoop(arr), 5);

    }

    @Test
    void SumLoopTest3()
    {
        int[] arr = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        assertEquals(sum.sumLoop(arr), 50);

    }

    @Test
    void SumLoopTest4()
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        assertEquals(sum.sumLoop(arr), 120);

    }

    @Test
    void SumStreamTest1()
    {
        int[] arr = new int[0];
        assertEquals(sum.sumLoop(arr), 0);

    }

    @Test
    void SumStreamTest2()
    {
        int[] arr = {1, 1, 1, 1, 1};
        assertEquals(sum.sumStream(arr), 5);

    }

    @Test
    void SumStreamTest3()
    {
        int[] arr = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        assertEquals(sum.sumStream(arr), 50);

    }

    @Test
    void SumStreamTest4()
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        assertEquals(sum.sumStream(arr), 120);

    }

}