import java.util.Scanner;

public class Q13 {

    /*

  13. Write a java program to input any two number and ask user to enter their symbol (+, -, /, *) find addition, Subtraction, multiplication and division according to theirsymbol(using if else)

     */

    public static void main(String[] args) {
        Q13.num();

    }


public static void num()
{
        Scanner solve = new Scanner(System.in);

        System.out.println("Enter the first and the Second number   "); // input using scanner class
        int a = solve.nextInt();
        int c = solve.nextInt();
        System.out.println("Choose and enter type of operation you want to perform (+,-,*,/,%");
        char op = solve.next().charAt(0);
        solve (a, c, op);
    }

     static void solve(int a, int c, char op)
    {
        int ans = 0;

        if (op == '+') {  // addition
            ans = a + c;
        }
        else if (op == '-') {   // substraction
            ans = a - c;
   }
        else if (op == '*') {     // multiplication
            ans = a * c;
        }

        else if (op == '/') {
            ans = a / c;  // divide
        }

        else if (op == '%') {  // mudulo
            ans = a % c;
        }

        System.out.println(" Your answer is - " + ans);
    }



}
