package Midweek;

import java.util.Scanner;

public class Q4 {
    /*
    Take values of length and breadth of a rectangle from user and check if it is square or not.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        double I = sc.nextDouble();
        System.out.println("Enter the breadth");
        double b = sc.nextDouble();
        if (I == b)
            System.out.println("Sqaure   ");
        else System.out.println("not a square");
    }
}
