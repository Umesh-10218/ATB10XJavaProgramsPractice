package TaskPrograms;

public class Prog6_19_jan_2025_Prog3 {
    public static void main(String[] args) {
        int a = 20;
        /* A+B+C
        --a --> A --> ExpA --> 19.  --> a=20-1=19
        a++ --> B --> ExpB -->19   --> a=19+1=20
        a-- --> C --> ExpC --> 20 --> a=20-1 =19
        ExpA+ExpB+ExpC --> 19+19+20
        a--> 19

         */
        System.out.println(--a + a++ + a--);
        System.out.println(a);

    }
}
