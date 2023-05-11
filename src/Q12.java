import java.util.Scanner;

public class Q12 {
    /*
    Write a java program to get numbers from users and print whether it is positive or negative in swtich statement
     */

    public static void main(String[] args) {
        num();
    }

    static void num() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any numbers");
        /* int nums = sc.nextInt(); */
        char nums = sc.next().charAt(0);

        String s1 = " print positive number";
        String s11 = s1;
        String s = s11;

        String no = String.valueOf(0 < 100);
        switch (s11) {

        }


        switch (nums) {
            case '1':
                System.out.println("1");
                break;
            case '2':
                System.out.println("2");
                break;
            case 'C':
                System.out.println("3");
                break;
            case 'D':
                System.out.println("4");
                break;
            case 'E':
                System.out.println("5");
                break;
            default:
                // out come of the number
                System.out.println("Positive number");


        }
    }
}