package TernaryOperators;

public class Prog2_AgeClassification {
    public static void main(String[] args) {
        int age = 6;
        /*
        Minor <18 ;
        Adult < 65 ;
        Senior >65;
        */
        String result = (age< 18) ? "Minor":((age< 65)?"Adult":"Senior");
        System.out.println(result);

    }
}
