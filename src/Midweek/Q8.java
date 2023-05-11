package Midweek;

import java.util.Scanner;

public class Q8 {
    /*
    A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
     */

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println(" Enter the class number");
        int d = c.nextInt();
        System.out.println(" Enter the number of class attend");
        int n=c.nextInt();
        float per=(d*100)/n;
        System.out.println("percentage: " +per);
        if(per<75){
            System.out.println(" yes or not??");
            int choise;
        System.out.println("1 : yes");
        System.out.println("2 : No");
            System.out.println(" enter the choise");
choise=c.nextInt();


        switch (choise){
            case 1:
                System.out.println("you can sit an exam");
                break;
            case 2:
                System.out.println("you cannot sit exam");
                break;
            default:
                System.out.println(" yes or no");
        }
    }
        else
            System.out.println("You can sit in examination room");
    }




}
