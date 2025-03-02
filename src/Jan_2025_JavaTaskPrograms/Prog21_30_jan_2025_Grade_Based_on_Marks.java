package Jan_2025_JavaTaskPrograms;

import java.util.Scanner;

public class Prog21_30_jan_2025_Grade_Based_on_Marks {
    public static void main(String[] args) {
        /*Inputs
   📌 Grading Criteria (Example)
Marks Range Grade
90 - 100   A+
80 - 89    A
70 - 79    B
60 - 69    C
50 - 59    D
40 - 49    E
Below 40   F

1️⃣ Take user input for marks (Use Scanner class).
2️⃣ Check the validity of marks (ensure they are between 0 and 100).
3️⃣ Use if-else-if conditions to determine the grade based on marks.
4️⃣ Display the grade as output.
         */
        Scanner score = new Scanner(System.in);
        System.out.println("Enter the Marks : ");
        int marks = score.nextInt();

        if (marks>=0 && marks<=100)
        {
            if (marks>=90 && marks<=100)
            {
                System.out.println(marks +" Marks & Grade is A+");
            }
            else if (marks>=80 && marks<=89)
            {
                System.out.println(marks +" Marks & Grade is A");
            }
            else if (marks>=70 && marks<=79)
            {
                System.out.println(marks +" Marks & Grade is B");
            }
            else if (marks>=60 && marks<=69)
            {
                System.out.println(marks +" Marks & Grade is C");
            }
            else if (marks>=50 && marks<=59)
            {
                System.out.println(marks +" Marks & Grade is D");
            }
            else if (marks>40 && marks<=49)
            {
                System.out.println(marks +" Marks & Grade is E");
            }
            else
            {
                System.out.println(marks +" Marks & Grade is F");
            }
        }
        else
        {
            System.out.println(marks +" Invalid Input ,Marks should be b/w 0 to 100");
        }
    }
}