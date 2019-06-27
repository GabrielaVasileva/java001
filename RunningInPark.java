package exercises;

import java.util.Scanner;

public class RunningInPark {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        int mins = 0;
        double ranDistance = 0;
        int calories = 0;
        for (int i = 0; i < n; i++)
        {
            int time = Integer.parseInt(scanner.nextLine());
            mins += time;
            double distance = Double.parseDouble(scanner.nextLine());
            String unit = scanner.nextLine();
            if (unit == "km")
                distance *= 1;
            else if (unit == "m")
                distance *= 0.001;
            ranDistance += distance;
            calories += time * 400 / 20;
        }

        System.out.printf("He ran %.2f km for %d minutes and burned %d calories.", ranDistance , mins, calories);


    }
}
