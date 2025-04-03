package Jan_2025_JavaTaskPrograms;

import java.util.Scanner;

public class Prog23_30_jan_2025_Number_is_Prime {
    public static void main(String[] args) {
        //I/P--> Number  & O/P --> Prime or not
        Scanner no = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = no.nextInt();


        if (num/1 == num && num/num == 1)
        {
            System.out.println(num + "is a prime number");
        }
        else
        {
            System.out.println(num + "is not a prime number");
            
        }



    }
}