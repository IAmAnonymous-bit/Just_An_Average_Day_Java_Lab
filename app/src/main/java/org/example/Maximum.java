package org.example;
import java.util.stream.*;
import java.lang.IllegalArgumentException;
import java.util.OptionalInt;

public class Maximum
{
    public int maxLoop(int[] arr)
    {
        if (arr.length == 0)
        {
            throw new IllegalArgumentException("Argument Array is Empty!");

        } else if (arr.length == 1) {
            return arr[0];

        } 

        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (max < arr[i])
            {
                max = arr[i];

            }

        }

        return max;
        
    }

    public int maxStream(int[] arr)
    {
        if (arr.length == 0)
        {
            throw new IllegalArgumentException("Argument Array is Empty!");

        } else if (arr.length == 1) {
            return arr[0];

        } 

        OptionalInt maxTemp = IntStream.of(arr).max();
        int max = maxTemp.getAsInt();
        return max;

    }

}

