import java.util.Scanner;
/*
1. Write a java program that tells us that Input number is odd or even? HINT: use ternary operator (? :)

 */
public class Q1 {


    public static void main(String[] args) {num();


    }

    public static void num(){
        {
            Scanner Q1 = new Scanner(System.in);
            System.out.println("Enter a number");  // enter even or odd number
            int number = Q1.nextInt();


            if (number % 2 == 0){  // enter even number
                System.out.println(number+ " is an even number");

            }

            else {
                System.out.println(number+ " is an odd number");  // enter odd number
            }
        }



    }


}

