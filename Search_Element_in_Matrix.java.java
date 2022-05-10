package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Driver program to test printPowerSet
    public static void main (String[] args)
    {
       int array[][] = {
               {1,2,3,4},
               {5,6,7,8},
               {9,10,11,12},
               {13,14,15,16}};

       int target = 11;
       boolean found = false;

       for(int i=0;i<array.length;i++)
       {
           for(int k=0;k<array.length;k++)
           {
               if(array[i][k]==target)
               {
                   found = true;
               }
           }

       }

       System.out.println("Found: "+found);
    }




}
