package TaskPrograms;

import java.util.Scanner;

public class Prog10_25_jan_2025_Vowels_Consonants {
    public static void main(String[] args) {
       // Count of Vowels & Consonants in a String
        int Vcount =0;
        int Ccount =0;

        //With CLI option
        Scanner VowCon = new Scanner(System.in);
        System.out.println("Enter a Name : ");
        String name = VowCon.next();





        //Use this without CLI String name = "Umesh A";
        int i;
        for ( i=0 ; i <name.length() ; i++)
        {
            char ch = Character.toLowerCase(name.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                Vcount++;
            }
            else
            {
                Ccount++;
            }
        }
        System.out.println("No of Vowels = " + Vcount);
        System.out.println("No of Consonants = " + Ccount);

    }
}
