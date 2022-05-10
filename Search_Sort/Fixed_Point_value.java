package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Driver program to test printPowerSet
    public static void main (String[] args)
    {
        int n=9, x=5;
        int arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };

        boolean found = false;
        int start_ind = 0, end_ind = 0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                start_ind = i;
                while(arr[i]==x)
                {
                    i++;
                }
                end_ind = i-1;
            }
        }

        System.out.print(start_ind + " " + end_ind);
    }
}
