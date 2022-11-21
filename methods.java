package com.bridgelabz;

public class methods {

    static int SubOfTwoNumbers(int a, int b) {
        long sub = a - b;
        return (int) sub;
    }

    static int ProductOfTwoNumbers(int p, int q){
        int prod = p * q;
        return prod;
    }

    public static void main(String[] args) {
        int s = SubOfTwoNumbers(14, 11);
        int result = s + 45;
        System.out.println(result);

        int p = ProductOfTwoNumbers(66,88);
        System.out.println(p);
    }
}