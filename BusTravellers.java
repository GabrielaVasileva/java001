package exercises;

import java.util.Scanner;

public class BusTravellers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int passengersCount = Integer.parseInt(scanner.nextLine());

        int busStopCount = Integer.parseInt(scanner.nextLine());



        for (int i = 0; i < busStopCount ; i++) {

            int passengersDown = Integer.parseInt(scanner.nextLine());

            int passengersOn = Integer.parseInt(scanner.nextLine());


            passengersCount = passengersCount - passengersDown + passengersOn;


            if ((i + 1) % 2 != 0){

                passengersCount += 2;

            }

            else if((i + 1) % 2 == 0){

                passengersCount -= 2;
            }


        }


        System.out.printf("The final number of passengers is : %d", passengersCount);

    }
}