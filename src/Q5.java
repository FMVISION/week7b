import java.util.Scanner;


public class Q5 {

    public static void main(String[] args){
marksheet();
    }

        public static void marksheet (){

        Scanner Q5 = new Scanner(System.in);

        System.out.println("Enter Student Name  :  "); //input student name
        String studentname = Q5.nextLine();

        System.out.println("Enter Roll No        :   ");// input roll no
        String rollno = Q5.nextLine();

        // input marks for 3 subjects
        System.out.println("Enter marks for Maths: ");
            int Mmarksheet = Q5.nextInt();
            System.out.println("Enter Marks of Science");
            int Smarksheet = Q5.nextInt();
            System.out.println(" Enter Mark of English");
            int Emarksheet = Q5.nextInt();
            int t = Mmarksheet + Smarksheet + Emarksheet;
            double p = t / 500 * 100;
            String g = "";

            if(p>=90)
                g ="A+";
            else if (p >=80)
                g ="A";
           else if(p>=70)
                g ="B+";
           else
                g ="E";
            System.out.println("Total Marks = " + t);
            System.out.println("Percentage  ="  + p);
            System.out.println("Grade = "  + g);


            System.out.println("|---------------------------------------------|");
            System.out.println("|                 Mark Sheet                  |");
            System.out.println("|---------------------------------------------|");
            System.out.println("|   Name                    :       08        |");
            System.out.println("|   Roll No                 :       23        |");
            System.out.println("|---------------------------------------------|");
            System.out.println("|   Subjects                :            Marks|");
            System.out.println("|---------------------------------------------|");
            System.out.println("|   Math                    :             98  |");
            System.out.println("|   Science                 :             90  |");
            System.out.println("|   English                 :             85  |");
            System.out.println("|---------------------------------------------|");
            System.out.println("|   Total                   :             273 |");
            System.out.println("|---------------------------------------------|");
            System.out.println("|   Percentage              :             91.0|");
            System.out.println("|   Result                  :             Pass|");
            System.out.println("|   Grade                   :              A+ |");
            System.out.println("|_____________________________________________|");


    }


    }





