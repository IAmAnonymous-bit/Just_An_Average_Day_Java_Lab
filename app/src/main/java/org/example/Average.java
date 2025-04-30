package org.example;
import java.util.stream.*;
import java.util.Arrays;
import java.lang.IllegalArgumentException;
import java.util.OptionalDouble;

public class Average
{
    public int averageLoop(int[] arr)
    {
        if (arr.length == 0)
        {
            throw new IllegalArgumentException("Argument Array is Empty!");

        } else if (arr.length == 1) {
            return arr[0];

        } 

        int ave = 0;
        double dAve = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }

        dAve = sum / arr.length;
        ave = (int)(dAve);

        return ave;

    }

    public int averageStream(int[] arr)
    {
        if (arr.length == 0)
        {
            throw new IllegalArgumentException("Argument Array is Empty!");

        } else if (arr.length == 1) {
            return arr[0];

        } 

        double[] tempArr = Arrays.stream(arr).asDoubleStream().toArray();
        OptionalDouble aveTemp1 = DoubleStream.of(tempArr).average();
        double aveTemp2 = aveTemp1.getAsDouble(); 
        int ave = (int)(aveTemp2);
        return ave;

    }
    
}