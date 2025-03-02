package Jan_2025_JavaTaskPrograms;

public class Prog9_25_jan_2025_Fizz_Buzz {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <=100 ; i++) {
            if (i % 3 == 0) {
                System.out.println( i + " is Multiple of 3 " + "Fizz");
            }
            if (i % 5 == 0)
            {
                System.out.println(i + " is Multiple of 5 " + "Buzz");
            }
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println( i + " is Multiple of 3 & 5 " + "FizzBuzz");
            }
        }

    }
}
