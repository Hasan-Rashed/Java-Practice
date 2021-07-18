package com.company;

import java.util.Formattable;
import java.util.Scanner;

public class Cwh_29_Practice_Set_6
{
    public static void main(String[] args)
    {
        // Practice Problem 1
      float []marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;

        for (float element : marks)
        {
            sum += element;
        }
        System.out.println("The value of sum is: " + sum);

        // Practice Problem 2
        int []num = {12, 14, 45, 65, 90, 39, 57};

        int key = 90;
        boolean isInArray = false;

        for (int element : num)
        {
            if (key == element)
            {
                isInArray = true;
                break;
            }
        }
        if (isInArray)
        {
            System.out.println("The value is present in the array");
        }
        else
        {
            System.out.println("The value is not present in the array");
        }

        // Practice problem 3
        float marks1[] = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum1 = 0;

        for (float elemnt : marks1)
        {
            sum1 += elemnt;
        }
        System.out.println("The value of average marks is " + sum1 / marks1.length);

        // practice problem 4
        int [][] mat1 = {{1, 2, 3}, {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13}, {3, 7, 1}};
        int [][] result = {{0, 0, 0}, {0, 0, 0}};

        for (int i = 0; i < mat1.length; i++)
        {
            for (int j = 0; j < mat2.length; j++)
            {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        //practice problem 5
        int [] arr = {1, 2, 3, 4, 5, 12, 54};
        int l = arr.length;
        int n = Math.floorDiv(l , 2);
        int temp;

        for (int i = 0; i < n; i++)
        {
            // swap a[i] and a[l - 1 - i]
            temp = arr[i];
            arr[i] = arr[l - 1 - i];
            arr[l - 1 - i] = temp;
        }

        for (int i : arr)
        {
            System.out.print(i + " ");
        }

        // practice problem 6
        int [] arr1 = {1, 2, 3, 4, 5, 455, 12, 54};
        int max = Integer.MIN_VALUE;;

        for (int e : arr1)
        {
            if (e > max)
            {
                max = e;
            }
        }
        System.out.println("the maximum element in this array is: " + max);

        // practice problem 7
        int [] arr2 = {1, 2, 3, 4, 5, 455, 12, -524};
        int min = Integer.MAX_VALUE;

        for (int e : arr2)
        {
            if (e < min)
            {
                min = e;
            }
        }
        System.out.println("the minimum element in this array is: " + min);

        int [] arr3 = {1, 2100, 3, 455, 5, 34, 67};
        boolean isSorted = true;

        for (int i = 0; i < arr3.length - 1; i++)
        {
            if (arr3[i] > arr3[i + 1])
            {
                isSorted = false;
                break;
            }
        }

        if (isSorted)
        {
            System.out.println("The array is sorted");
        }
        else
        {
            System.out.println("The array is not sorted");
        }
    }
}
