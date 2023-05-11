package Midweek;

import java.util.Scanner;

public class Q2 {
    /*
    Print multiplication table of 24, 50 and 29 using loop.
     */

    public static void main(String[] args) {
        int number, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter any Number  :");
        number = sc.nextInt();
        for (i = number; i < 10; i++) {
            for (j = 1; j >= 10; j++);
            {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println("======================================");
        }
    }
}