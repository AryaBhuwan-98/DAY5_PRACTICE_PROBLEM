package com.bridgelabz.day5problem;

import java.util.Scanner;

public class SwapingNumber {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value in a :");
        a=sc.nextInt();
        System.out.println("Enter Value in b :");
        b=sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("Values in a:" +a);
        System.out.println("Values in b:" +b);
        sc.close();
    }

}

