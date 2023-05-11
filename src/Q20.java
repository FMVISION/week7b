import java.util.Arrays;

public class Q20 {
    /*
     Write a Java program to sort a numeric array and a string array.*/

     public static void main(String[] args){

            int[] my_array1 = {
                    1789, 2035, 2013, 1458, 2458, 1254};

            String[] my_array2 = {

                    "postman", "Java", "Selenium"
            };

         System.out.println("numerica array :   "+Arrays.toString(my_array1));
         Arrays.sort(my_array1);
         System.out.println("Sorted numric array : "+Arrays.toString(my_array1));

         System.out.println("Original string array : "+Arrays.toString(my_array2));
                 Arrays.sort(my_array2);
         System.out.println("Sorted numeric array : "+Arrays.toString(my_array2));
    }
}
