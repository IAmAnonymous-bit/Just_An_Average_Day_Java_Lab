package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class AveTest
{
    Average ave;

    @BeforeEach
    void setUp()
    {
        ave = new Average();

    }

    @Test
    void aveLoopTest1()
    {
        int[] arr = {1, 3, 3, 3 , 5};
        assertEquals(ave.averageLoop(arr), 3);

    }

    @Test
    void aveLoopTest2()
    {
        int[] arr = {5, 1, 7, 5, 5, 8, 5, 10, 5, 1};
        assertEquals(ave.averageLoop(arr), 5);

    }

    @Test
    void aveLoopTest3()
    {
        int[] arr = {7, 7, 2, 3, 7, 5, 7, 10, 8, 7, 2, 7, 7, 7, 7};
        assertEquals(ave.averageLoop(arr), 6);

    }

    @Test
    void aveStreamTest1()
    {
        int[] arr = {1, 3, 3, 3 , 5};
        assertEquals(ave.averageStream(arr), 3);

    }

    @Test
    void aveStreamTest2()
    {
        int[] arr = {5, 1, 7, 5, 5, 8, 5, 10, 5, 1};
        assertEquals(ave.averageStream(arr), 5);

    }

    @Test
    void aveStreamTest3()
    {
        int[] arr = {7, 7, 2, 3, 7, 5, 7, 10, 8, 7, 2, 7, 7, 7, 7};
        assertEquals(ave.averageStream(arr), 6);

    }

}