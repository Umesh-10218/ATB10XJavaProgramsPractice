package TaskPrograms;

import java.util.Scanner;

public class Prog14_29_jan_2025_Max_of_Two_Numbers {
    public static void main(String[] args) {
        //Inputs n1 & n2  & Outputs  n1> n2
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number n1 : ");
        int n1 = num.nextInt();
        System.out.println("Enter the number n2 : ");
        int n2 = num.nextInt();


        if (n1>n2)
        {
            System.out.println("N1 is Greater");
        }
        else
        {
            System.out.println("N2 is Greater");
        }

    }
}
