package Jan_2025_JavaTaskPrograms;

import java.util.Scanner;

public class Prog22_30_jan_2025_Character_is_an_Alphabet {
    public static void main(String[] args) {
        //I/P--> ch & O/P --> Alphabet or not
        Scanner chr = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char ch = chr.next().charAt(0);

        if (Character.isLetter(ch))
        {
            System.out.println(ch +" is a Alphabet");
        }
        else
        {
            System.out.println(ch +" is Not a Alphabet");
        }

    }
}