package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class MaxTest
{
    Maximum max;

    @BeforeEach
    void setUp()
    {
        max = new Maximum();

    }

    @Test
    void maxLoopTest1()
    {
        int[] arr = {1, 6, 3, 8, 10};
        assertEquals(max.maxLoop(arr), 10);

    }

    @Test
    void maxLoopTest2()
    {
        int[] arr = {10, 8, 5, 2, 9, 5, 3, 2, 1, 7};
        assertEquals(max.maxLoop(arr), 10);
        
    }

    @Test
    void maxLoopTest3()
    {
        int[] arr = {5, 6, 7, 2, 5, 1, 8, 10, 9, 2, 1, 5, 7, 1, 7};
        assertEquals(max.maxLoop(arr), 10);
        
    }

    @Test
    void maxStreamTest1()
    {
        int[] arr = {1, 6, 3, 8, 10};
        assertEquals(max.maxStream(arr), 10);
        
    }

    @Test
    void maxStreamTest2()
    {
        int[] arr = {10, 8, 5, 2, 9, 5, 3, 2, 1, 7};
        assertEquals(max.maxStream(arr), 10);
        
    }

    @Test
    void maxStreamTest3()
    {
        int[] arr = {5, 6, 7, 2, 5, 1, 8, 10, 9, 2, 1, 5, 7, 1, 7};
        assertEquals(max.maxStream(arr), 10);
        
    }

}