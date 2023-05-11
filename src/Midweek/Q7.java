package Midweek;

import java.util.Scanner;

public class Q7 {
    /*
    Take input of age of 3 people by user and determine oldest and youngest among
them.
     */

    public static void main(String[] args) {
        int age1 ,age2,age3,max,min;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the age of First Person:  ");
        age1=s.nextInt();
        System.out.println("Enter the age of Second Person:");
        age2=s.nextInt();
        System.out.println("Enter the age of Third Person: ");
        age3=s.nextInt();
        if(age1>age2 && age1>age3)
            System.out.println("First Person is the Oldest");
        else if (age2>age1 && age2>age3)
            System.out.println("Second person is the Oldest");
        else if (age3>age1 && age3>age1)
            System.out.println("Third Person is the Oldest");
        else {
            System.out.println("All have equal age");
        System.exit(0);
    }
if(age1<age2 && age1<age3)
    System.out.println("First Person is the Youngest");
else if(age2<age1 && age2<age3)
    System.out.println("Second Person is the Youngest");
else if(age3<age1 && age3<age2)
    System.out.println("Third Person is the Youngest");
s.close();

       }


    }



