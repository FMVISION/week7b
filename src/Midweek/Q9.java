package Midweek;

import java.util.Scanner;

public class Q9 {
    /*
Modify the above question to allow student to sit if he/she has medical cause. Ask
user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.*/

    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);
        System.out.println(" Enter the class number");
        int d = c.nextInt();
        System.out.println(" Enter the number of class attend");
        int n = c.nextInt();
        float per = (d * 100) / n;
        System.out.println("percentage: " + per);
        if (per < 75) {
            System.out.println(" Are you medical student ?? yes or not ??");
            int choise;
            System.out.println("1 : yes");
            System.out.println("2 : No");
            System.out.println(" Enter the choise");
            choise = c.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("you can sit an exam");
                    break;
                case 2:
                    System.out.println("you cannot sit exam");
                    break;
                default:
                    System.out.println(" if any other is pressed");
            }
        } else
            System.out.println("You can sit in examination room");
    }


}




