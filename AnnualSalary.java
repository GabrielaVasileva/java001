package exercises;

import java.util.Scanner;

public class AnnualSalary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int experience = Integer.parseInt(scanner.nextLine());
        String specialty = scanner.nextLine();
        double salary = 0;

        if (specialty.equalsIgnoreCase("C# Developer")){
            salary = 5400;
        }
        else if (specialty.equalsIgnoreCase("Java Developer")) {
            salary = 5700;
        }
        else if (specialty.equalsIgnoreCase("Front-End Web Developer"))
        {
            salary = 4100;
        }
        else if (specialty.equalsIgnoreCase("UX / UI Designer")){
            salary = 3100;
        }
        else if (specialty.equalsIgnoreCase("Game Designer")){
            salary = 3600;
        }

        if (experience <= 5)
            salary -= salary * 0.658;

        double yearIncome = 12 * salary;
        System.out.println(specialty);
        System.out.println(salary);
        System.out.printf("Total earned money: %.2f BGN", yearIncome);
    }

}
