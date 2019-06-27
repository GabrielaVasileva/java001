package exercises;

import java.util.Scanner;

public class SeaTrip {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        double foodMoney = Double.parseDouble(scanner.nextLine());
        double souvenirMoney = Double.parseDouble(scanner.nextLine());
        double hotelMoney = Double.parseDouble(scanner.nextLine());

        double sumForTransport = (420.0 / 100.0) * 7 * 1.85;
        double foodAndSouvenir = 3 * foodMoney + 3 * souvenirMoney;
        double sumForStay = hotelMoney * 0.9 + hotelMoney * 0.85 + hotelMoney * 0.8;

        double totalSum = sumForTransport + foodAndSouvenir + sumForStay;
        System.out.printf ("Money needed: %.2f", totalSum);
    }
}
