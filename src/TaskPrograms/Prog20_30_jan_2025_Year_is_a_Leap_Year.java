package TaskPrograms;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Prog20_30_jan_2025_Year_is_a_Leap_Year {
    public static void main(String[] args) {
        // I/P-->year  & O/P --> Year % 4 == 0
        Scanner year = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int yr = year.nextInt();

        if (yr % 4 == 0)
        {
            System.out.println( yr + " is a leap year ");
        }
        else{
            System.out.println( yr + " is not a leap year ");
        }
    }
}