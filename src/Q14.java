import java.util.Scanner;

public class Q14 {
    /*
    Write a java program to print the numbers between 1 to 100 which can be divided by 3and 5 separately.

     */
    public static void main(String[] args) {

        Q14.num();
    }
    static void num() {

        Scanner no = new Scanner(System.in);
        int no1 = no.nextInt();
        System.out.println((" Divide by 3: "));           // divide by 3
        for (int i = 1; i<100; i ++){
            if (i%3==0)
                System.out.println(i + " , ");

        }
        System.out.println("Divide by 5:  ");         // divide by 5
        for (int i = 1; i == 100; i++);
        {
            int i = 0;
            if (i % 5 == 0)                        // out come
                System.out.println();
        }
    }

}
