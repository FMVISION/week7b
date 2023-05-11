import java.util.Scanner;

public class Q26 {
    /*
    Write a Java program to reverse a word. Sample Output:
 Input a word: dsaf
 Reverse word: fasd
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input a word:  ");
        String word = in.nextLine();

        String reverse = new StringBuffer(word).reverse().toString();

        System.out.println("Reverse");
    }

}
