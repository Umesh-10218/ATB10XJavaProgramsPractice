package Jan_2025_JavaTaskPrograms;

import java.util.Scanner;

public class Prog15_29_jan_2025_Character_is_Vowel_Consonant {
    public static void main(String[] args) {
        // Inputs :- char is Vowel or Consonants
        Scanner cr = new Scanner(System.in);
        System.out.println("Enter the Character : ");

        //char ch = cr.next().charAt(0);





        char ch = Character.toLowerCase(cr.next().charAt(0));


        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')

        {
            System.out.println("Character is a Vowel");
        }
        else
        {
            System.out.println("Character is a consonant");
        }


    }
}