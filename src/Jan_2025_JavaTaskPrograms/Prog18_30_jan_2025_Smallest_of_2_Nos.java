package Jan_2025_JavaTaskPrograms;

import java.util.Scanner;

public class Prog18_30_jan_2025_Smallest_of_2_Nos {
    public static void main(String[] args) {
        //I/P --> 2 Nos n1 , n2  &
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the 1st Number : ");
        int n1 = num.nextInt();
        System.out.println("Enter the 2nd Number : ");
        int n2 = num.nextInt();

        if (n1<n2)
        {
            System.out.println("n1 is Smallest -->" + n1);
        }
        else
        {
            System.out.println("n2 is Smallest --> " + n2);
        }
    }
}