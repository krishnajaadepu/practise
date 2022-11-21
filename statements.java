package com.bridgelabz;

public class statements {
    public static void main(String[] args) {
        int b = 15;

        //if-else
        if (b < 18) {
            System.out.println("if block " + b);
        } else {
            System.out.println("else block" + b);
        }

        //if-else-if
        if (b > 20) {
            System.out.println("b is > 20");
        } else if (b >= 15 && b <= 40) {
            System.out.println("b is >= 15 and b is <= 40");
        } else {
            System.out.println("b > 10");
        }
    }
}