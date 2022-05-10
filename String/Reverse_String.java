package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Driver program to test printPowerSet
    public static void main (String[] args)
    {
         String x = "Happy Birthday";

         for(int i=0;i<x.length();i++)
         {
             System.out.print(x.charAt((x.length()-1)-i));
         }
    }




}
