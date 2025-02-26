package TaskPrograms;

import java.util.Scanner;

public class Prog17_30_jan_2025_Greatest_of_3_Nos {
    public static void main(String[] args) {
        //Inputs --> n1 , n2 ,n3 greater of 3 nos
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the 1st Number : ");
        int n1 = num.nextInt();
        System.out.println("Enter the 2nd Number : ");
        int n2 = num.nextInt();
        System.out.println("Enter the 3rd Number : ");
        int n3 = num.nextInt();

        if(n1>n2 && n1>=3)
        {
            System.out.println("N1 is Greater");
        }
        else if (n2>n3 && n2>n1)
        {
            System.out.println("N2 is Greater");
        }
        else
        {
            System.out.println("N3 is Greater");
        }


    }
}