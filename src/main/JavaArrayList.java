package main;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] marks = new int[size];
        for (int i = 0; i < marks.length; i++) {
            marks[i] =sc.nextInt();
        }
        for (int mark : marks) {
            System.out.println(mark);
        }
        System.out.println("Enter ele to be searched");
        int value = sc.nextInt();
        int pos = LinearSearch(marks, value);
if(pos==-1)
{
    System.out.println(value+" not found in array");
}else{
    System.out.println(value+" found at position "+pos);
}

    }
    private static int LinearSearch(int[] marks, int value) {
        int pos=-1;
        for (int i = 0; i < marks.length; i++) {
            if(marks[i]==value)
            {
                pos=i;
                break;
            }
        }
        return pos;
    }
}

