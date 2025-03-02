package Jan_2025_JavaTaskPrograms;

import java.util.Scanner;

public class Prog11_25_jan_2025_Palindrome_of_a_str {
    public static void main(String[] args) {
      /* Inputs and outputs
      name = madam    & rev.name=madam
       */
        // Using CLI option to give inputs
        Scanner palin =  new Scanner(System.in);
        System.out.println("Enter the word : ");
        String str = palin.next();


        String Reversedstr = new StringBuilder(str).reverse().toString();


        //Condition
        if (str.equalsIgnoreCase(Reversedstr))
        {
            System.out.println("Given word is a palindrome");
        }
        else
        {
            System.out.println("Given word is not a palindrome");
        }
    }
}
