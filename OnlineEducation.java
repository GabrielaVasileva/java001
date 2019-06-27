package exercises;

import java.util.Scanner;

public class OnlineEducation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String studyingForm1 = scanner.nextLine().toLowerCase();
        int students1 = Integer.parseInt(scanner.nextLine());
        String studyingForm2 = scanner.nextLine().toLowerCase();
        int students2 = Integer.parseInt(scanner.nextLine());
        String studyingForm3 = scanner.nextLine().toLowerCase();
        int students3 = Integer.parseInt(scanner.nextLine());

        int sumOnline = 0;
        int sumOnsite = 0;
        int sum = 0;

        switch (studyingForm1) {
            case "online":
                sumOnline += students1;
                break;
            case "onsite":
                sumOnsite += students1;
                break;
        }
        switch (studyingForm2) {
            case "online":
                sumOnline += students2;
                break;
            case "onsite":
                sumOnsite += students2;
                break;
        }
        switch (studyingForm3) {
            case "online":
                sumOnline += students3;
                break;
            case "onsite":
                sumOnsite += students3;
                break;
        }

        if (sumOnsite > 600) {
            sumOnline += sumOnsite - 600;
            sumOnsite = 600;
        }

        sum = sumOnline + sumOnsite;


        System.out.printf("Online students: %d BGN", sumOnline);
        System.out.printf("Onsite students: %d BGN", sumOnsite);
        System.out.printf("Total students: %d BGN", sum);
    }
}
