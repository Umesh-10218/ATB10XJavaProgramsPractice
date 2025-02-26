package TaskPrograms;

import java.util.Scanner;

public class Prog19_30_jan_2025_Smallest_of_3_Nos {
    public static void main(String[] args) {
        //I/P --> n1,n2,n3 & O/P one number is smallest
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the 1st Number ");
        int n1 = num.nextInt();
        System.out.println("Enter the 2nd Number ");
        int n2 = num.nextInt();
        System.out.println("Enter the 3rd Number ");
        int n3 = num.nextInt();

        if (n1<n2 && n1<n3)
        {
            System.out.println("Smallest Number is n1--> " + n1);
        }
        else if (n2<=n3 && n2<=n1)
        {
            System.out.println("Smallest Number is n2--> " + n2);
        }
        else
        {
            System.out.println("Smallest Number is n3--> " + n3);
        }


    }
}