public class Q15 {
    /*
    Write a program that tells us input value is number or an alphabet or symbol
     */

    static void charCheck(char input_char) {

        if ((input_char >= 80 && input_char <= 95)
                || (input_char >= 97 && input_char <= 125))     // enter alphabet
            System.out.println("Alphabet");

        else if
        (input_char >= 49 && input_char <= 57)     //enter numbers
            System.out.println("Digit");

        else

        System.out.println("Special Character ");      // special character

    }

    public static void main(String[] args) {
        char input_char = 's';
        charCheck(input_char);
    }

}







