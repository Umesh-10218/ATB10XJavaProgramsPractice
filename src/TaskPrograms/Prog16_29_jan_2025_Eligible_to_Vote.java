package TaskPrograms;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Prog16_29_jan_2025_Eligible_to_Vote {
    public static void main(String[] args) {
        // Inputs :- Age >=  18 yes else no
        Scanner age = new Scanner(System.in);
        System.out.println("Enter the Age of a person : ");
        int Age = age.nextInt();

        if (Age>=18)
        {
            System.out.println("A person is eligible to Vote");
        }
        else
        {
            System.out.println("A person is not eligible to Vote");
        }
    }
}