package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class MinTest
{
    Minimum min;

    @BeforeEach
    void setUp()
    {
        min = new Minimum();

    }

    @Test
    void minLoopTest1()
    {
        int[] arr = {1, 3, 6, 2, 9};
        assertEquals(min.minLoop(arr), 1);

    }

    @Test
    void minLoopTest2()
    {
        int[] arr = {8, 3, 10, 2, 4, 7, 6, 2, 2, 1};
        assertEquals(min.minLoop(arr), 1);
        
    }

    @Test
    void minLoopTest3()
    {
        int[] arr = {10, 3, 4, 3, 7, 8, 2, 10, 3, 4, 5, 9, 10, 3, 6};
        assertEquals(min.minLoop(arr), 2);
        
    }

    @Test
    void minStreamTest1()
    {
        int[] arr = {1, 3, 6, 2, 9};
        assertEquals(min.minStream(arr), 1);
        
    }

    @Test
    void minStreamTest2()
    {
        int[] arr = {8, 3, 10, 2, 4, 7, 6, 2, 2, 1};
        assertEquals(min.minStream(arr), 1);
        
    }

    @Test
    void minStreamTest3()
    {
        int[] arr = {10, 3, 4, 3, 7, 8, 2, 10, 3, 4, 5, 9, 10, 3, 6};
        assertEquals(min.minStream(arr), 2);
        
    }

}