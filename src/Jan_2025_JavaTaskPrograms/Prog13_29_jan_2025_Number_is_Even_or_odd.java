package Jan_2025_JavaTaskPrograms;

import java.util.Scanner;

public class Prog13_29_jan_2025_Number_is_Even_or_odd {
    public static void main(String[] args) {
      /* Inputs and outputs
     Even or Odd Number
       */
      //Using Cli options to give inputs
      Scanner num = new Scanner(System.in);
      System.out.println("Enter the Number : ");
      int number = num.nextInt();


      if (number >= 0)
      {
          if (number % 2 == 0)
          {
              System.out.println("Given Number is Even");
          }
          else
          {
              System.out.println("Given Number is Odd");
          }
      }
      else
      {
          System.out.println("Given Number is Negative");
      }
    }
}
