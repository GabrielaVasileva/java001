package exercises;

import java.util.Scanner;

public class EiffelTower {

    public static String repeat(String str, int times) {
        char[] innerCharArray = new char[times];

        String fromChar =  new String(innerCharArray);

        String result = fromChar.replace("\0", str);
        return result;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++)
        {
            System.out.println(repeat("-", n + 2) + "**" + repeat("-", n + 2));
        }
        for (int i = 1; i <= n-3; i++)
        {
            System.out.println(repeat("-", n + 1) + "****" + repeat("-", n + 1));
        }
        System.out.println(repeat("-", n) + "******" + repeat("-", n));

        for (int i = 1; i <= n-4; i++)
        {
            System.out.println(repeat("-", n) + "**--**" + repeat("-", n));
        }
        for (int i = 1; i <= n - 3; i++)
        {
            System.out.println(repeat("-", n -1) + "**----**" + repeat("-", n - 1));
        }
        System.out.println(repeat("-", n-2) + "**********" + repeat("-", n-2));

        for (int i = n-3; i >=1; i--)
        {
            System.out.println(repeat("-", i) + "**" + repeat("-",(2*n +2-2*i)) + "**" + repeat("-", i));
        }
        System.out.println("***" + repeat("-", (2 * n )) + "***");
    }

}
