package org.example;
import java.util.stream.*;
import java.util.Arrays;
import java.util.OptionalDouble;

public class Sum
{
    public int sumLoop(int[] arr)
    {
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];

        }

        return sum;

    }

    public int sumStream(int[] arr)
    {
        double[] tempArr = Arrays.stream(arr).asDoubleStream().toArray();
        double sumTemp = DoubleStream.of(tempArr).sum();
        int sum = (int)(sumTemp);
        return sum;

    }

}