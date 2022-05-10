package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Driver program to test printPowerSet
    public static void main (String[] args)
    {
         String x = "MalayalaM";
         String reverse = "";

         for(int i=0;i<x.length();i++)
         {
             reverse = reverse + x.charAt((x.length()-1)-i);
         }

         System.out.println(reverse);
         if(x.equals(reverse))
         {
             System.out.println("Palindrome");
         }
         else
         {
             System.out.println("Not a palindrome");
         }
    }




}
