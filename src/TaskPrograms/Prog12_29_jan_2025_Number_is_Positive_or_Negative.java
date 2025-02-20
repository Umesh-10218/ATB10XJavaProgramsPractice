package TaskPrograms;

import java.util.Scanner;

public class Prog12_29_jan_2025_Number_is_Positive_or_Negative {
    public static void main(String[] args) {
      /* Inputs and outputs
      +ve or -ve Number
       */
      //Using Cli options to give inputs
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = num.nextInt();


        if (number >= 0)
        {
            System.out.println("Given Number is Positive");
        }
        else
        {
            System.out.println("Given Number is Negative");
        }


    }
}
