public class Q3 {
    /*
    Declare multidimensional array and store 5 countries and their capital and print them in
console.
     */
    static String name[][] = {{"Uk", "India", "Morroco", "Tunisia", "Dubai"}, {"Tunisia", "Dubai"}};// fixed array

    public static void main(String[] args) {


            for (int i = 0; i < name.length; ++i) {
                for (int j = 0; j < name[i].length; ++j) {
                    System.out.println(name[i][j]);

                }
            }
        }
    }

