package exercises;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        System.out.print("Enter the side a: ");
        String  readA = console.nextLine();
        int a = Integer.parseInt(readA);

        System.out.print("Enter the side b: ");
        String  readB = console.nextLine();
        int b = Integer.parseInt(readB);

        System.out.print("The area is :" +(a*b));

    }

}
