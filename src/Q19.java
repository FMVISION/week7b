import java.util.Scanner;

public class Q19 {
    /*
    19. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”
     */


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println( "input the number : ");
 int n = in.nextInt();

    if (n > 0 )
    {
        System.out.println("Number is Positive");
    }
    else if (n < 0) {
        System.out.println("number is Negative");
    }

    else {
        System.out.println("number is zeo");
    }


    }
}
