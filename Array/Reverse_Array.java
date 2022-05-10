package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Driver program to test printPowerSet
    public static void main (String[] args)
    {
       int array[] = {1,2,3,4,5};

       int i=0;
       int j= array.length-1;

       while(i<j)
       {
           int temp = array[i];
           array[i] =  array[j];
           array[j] = temp;
           i++;
           j--;
       }

       System.out.println(Arrays.toString(array));
    }




}
