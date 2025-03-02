package Jan_2025_JavaTaskPrograms;

public class Prog1_Greaterof3Numbers {
    public static void main(String[] args) {

        int n1 =-45 , n2 =00 , n3 =-30 ;

        int result = (n1>=n2) ? ((n1>=n3) ? n1:n3) : ((n2>=n3)?n2:n3);
        System.out.println(result);
    }
}
