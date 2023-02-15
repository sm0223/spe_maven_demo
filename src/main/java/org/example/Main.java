package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello-world");
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial = " + fact(n));
    }
    public static int fact(int n) {
        if(n <=1) return 1;
        return n*fact(n-1);
    }
}