package Jan_2025_JavaTaskPrograms;

public class Prog7_19_jan_2025_CLI_Option_Name_Age_Sal {
    public static void main(String[] args) {
        String name = args [0];
        String ageofperson = args [1];
        int age = Integer. parseInt(ageofperson);
        String salary = args[2];
        System.out.println("Name is " +name);
        System.out.println("Age is " +age);
        System.out.println("Salary is " +salary);

    }
}
