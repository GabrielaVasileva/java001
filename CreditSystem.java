package exercises;

import java.util.Scanner;

public class CreditSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        double credits = 0;

        for (int i = 0; i < n; i++) {


            char c = scanner.nextLine().trim().charAt(0);
            int grade = Integer.parseInt(scanner.nextLine());
            double credit = Double.parseDouble(scanner.nextLine());
            sum += grade;

            switch (grade) {
                case 2:
                    credit = 0;
                    break;
                case 3:
                    credit = credit / 2;
                    break;
                case 4:
                    credit = credit * 0.7;
                    break;
                case 5:
                    credit = credit * 0.85;
                    break;

            }
            credits += credit;
        }

        System.out.printf("credits: %.2f", credits);
        System.out.println("");
        System.out.printf("sum / n: %.2f", sum / n);
    }
}
