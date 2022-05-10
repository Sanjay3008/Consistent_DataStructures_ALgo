package com.company;

import java.util.Arrays;
import java.util.Scanner;
// Recursive Java program to reverse
// a linked list
class recursion {
    static Node head; // head of list

    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    static Node reverse(Node head)
    {
        Node first = head;
        Node last = null;
        Node tmp = head;

        while(first!=null)
        {
            tmp = first.next;
            first.next = last;
            last = first;
            first = tmp;


        }

        return last;
    }

    /* Function to print linked list */
    static void print()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void push(int data)
    {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }


    /* Driver program to test above function*/

}

// This code is contributed by Prakhar Agarwal

public class Main {

    // Driver program to test printPowerSet
    public static void main (String[] args)
    {
        recursion rst = new recursion();
        rst.push(20);
        rst.push(4);
        rst.push(15);
        rst.push(85);

        System.out.println("Given linked list");
        rst.print();

        rst.head = rst.reverse(rst.head);

        System.out.println("Reversed Linked list");
        rst.print();

    }

}
