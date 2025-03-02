package Jan_2025_JavaTaskPrograms;

public class Prog5_19_jan_2025_Prog2 {
    public static void main(String[] args) {
        int a = 75;
        /* A+B+C
        ++a --> A --> ExpA --> 76.  --> a=1+75=76
        a++ --> B --> ExpB -->76   --> a=76+1=77
        a++ --> C --> ExpC --> 77 --> a=77+1 =78
        ExpA+ExpB+ExpC --> 76+76+77 =229
        a--> 78

         */

        System.out.println(++a+a+++a++);
        System.out.println(a);

    }
}
