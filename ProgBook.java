package exercises;

import java.util.Scanner;

public class ProgBook {

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        double pricePerPage = Double.parseDouble(scanner.nextLine());
        double pricePerFrontPage = Double.parseDouble(scanner.nextLine());
        int discountPercent = Integer.parseInt(scanner.nextLine());
        double designerSalary = Double.parseDouble(scanner.nextLine());
        int teamSalaryPercent = Integer.parseInt(scanner.nextLine());

        double bookPrice = pricePerPage * 899 + pricePerFrontPage * 2;
        double afterDiscount = bookPrice - bookPrice * (double)discountPercent / 100;
        double finalSum = afterDiscount + designerSalary;
        double finalPriceToPay = finalSum - finalSum * (double)teamSalaryPercent / 100;

        System.out.printf("Final price to pay :  " + finalPriceToPay);
    }
}
