package TaskPrograms;

public class Prog8_19_jan_2025_CLI_Option_2 {
    public static void main(String[] args) {
        String no1 = args [0];
        int n1 = Integer.parseInt(no1);
        String no2 = args[1];
        int n2 =Integer.parseInt(no2);
        int max_number = (n1>n2) ? n1:n2 ;
        System.out.println(max_number);

    }
}
