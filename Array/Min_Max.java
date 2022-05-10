package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Driver program to test printPowerSet
    public static void main (String[] args)
    {
       int array[] = {1,2,-3,4,5};

       int min = array[0];
       int max = array[0];
       for(int i=1;i<array.length;i++)
       {
           if(array[i]<min)
           {
               min = array[i];
           }
           else if(array[i]>max)
           {
               max = array[i];
           }
       }
       System.out.println(min + " "+ max);
    }




}
