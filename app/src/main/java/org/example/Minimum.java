package org.example;
import java.util.stream.*;
import java.lang.IllegalArgumentException;
import java.util.OptionalInt;

public class Minimum
{
    public int minLoop(int[] arr)
    {
        if (arr.length == 0)
        {
            throw new IllegalArgumentException("Argument Array is Empty!");

        } else if (arr.length == 1) {
            return arr[0];

        } 

        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (min > arr[i])
            {
                min = arr[i];

            }

        }

        return min;

    }

    public int minStream(int[] arr)
    {
        if (arr.length == 0)
        {
            throw new IllegalArgumentException("Argument Array is Empty!");

        } else if (arr.length == 1) {
            return arr[0];

        } 

        OptionalInt minTemp = IntStream.of(arr).min();
        int min = minTemp.getAsInt();
        return min;

    }
    
}