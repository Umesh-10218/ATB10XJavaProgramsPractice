package TaskPrograms;

import java.util.Scanner;

public class Prog4_Grade_Calculator_Ternary_operator {
    public static void main(String[] args) {
        int marks = 75;
        // result = condition ? exp1 : exp2 ;
        String result =((marks>=90 && marks<=100) ? "A" : (marks>=80 && marks<=89) ? "B" : (marks>=70 && marks<=79)? "C" : (marks>=60 && marks<=69)? "D": (marks>=0 && marks<=59)?"F":"Failed");
        System.out.println(result);
    }
}
