package exercises;

import java.util.Scanner;

public class CalorieCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char gender = scanner.nextLine().trim().charAt(0);
        double weight = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        int age = Integer.parseInt(scanner.nextLine());
        String physicalActivity = scanner.nextLine();

        double blm = 0.0;

        if (gender == 'm') {
            blm = 66 + (13.7 * weight) + (5 * height * 100) - (6.8 * age);
        } else if (gender == 'f') {
            blm = 655 + (9.6 * weight) + (1.8 * height * 100) - (4.7 * age);
        }

        if (physicalActivity == "sedentary") {
            blm *= 1.2;
        } else if (physicalActivity == "lightly active") {
            blm *= 1.375;
        } else if (physicalActivity == "moderately active") {
            blm *= 1.55;
        } else if (physicalActivity == "very active") {
            blm *= 1.725;
        }


        int blmInt = (int) Math.ceil(blm);
        System.out.printf("To maintain your current weight you will need  %d blm calories per day.", blmInt);
    }
}
