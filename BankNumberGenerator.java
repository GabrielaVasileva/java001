package exercises;

import java.util.Scanner;

public class BankNumberGenerator {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);




//        Входът е следния:
//
//• Първи ред: a – цяло число в интервала [10...99]
//
//• Втори ред: b – буква от латинската азбука [A…Z]
//
//• Трети ред: c – буква от латинската азбука [a…z]
//
//• Четвърти ред: d – буква от латинската азбука [A…Z]
//
//• Пети ред: e – цяло число в интервала [10...99]
//
//• Шести ред: N – цяло число в интервала [1...100]

        int a = Integer.parseInt(scanner.nextLine());
        char b = scanner.nextLine().trim().charAt(0);
        char c = scanner.nextLine().trim().charAt(0);
        char d = scanner.nextLine().trim().charAt(0);
        int e = Integer.parseInt(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        for (int j = a; j <= 99; j++)
        {
            for (char k = b; k <= 'Z'; k++)
            {
                for (char l = c; l <= 'z'; l++)
                {
                    for (char o = d; o <= 'Z'; o++)
                    {
                        for (int p = e; p >= 10; p--)
                        {


                            if (((j % 10) == 2) && ((p % 10) == 5)) {
                                counter += 1;
                            }

                            if (counter == N) {
                                System.out.printf("%d%s%s%s%d",j,String.valueOf(k),String.valueOf(l),String.valueOf(o),p);
                                return;
                            }
                        }
                    }
                }

            }
        }
    }
}
