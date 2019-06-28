package exercises;


import java.util.Scanner;

public class SublimeLogo {

    public static String repeatNTimes(String s, int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(s);
        }
        return builder.toString();
    }

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

        String space = " ";
        String star = "*";

        int spacescount = 2 * n - 2;
        int starscount = 2;

        //top

        for (int row = 0; row < n; row++)
        {
            System.out.print(repeat(space,spacescount));
            System.out.print(repeat(star,starscount));
            spacescount -= 2;
            starscount += 2;
            System.out.println();
        }

        //middletop1

        spacescount = 2;
        starscount = 2 * n - 2;

        for (int row = 0; row < 2; row++)
        {
            System.out.print(repeat(star,starscount));
            System.out.print(repeat(space,spacescount));
            spacescount += 2;
            starscount -= 2;
            System.out.println();
        }

        //middletop2

        spacescount = 2;
        starscount = 2 * n - 2;

        for (int row = 0; row < 2; row++)
        {
            System.out.print(repeat(star,starscount));
            System.out.print(repeat(space,spacescount));
            if (spacescount > 0 && starscount > 0)
            {
                spacescount -= 2;
                starscount += 2;
            }
            System.out.println();

        }



        //middlebottom1

        spacescount = 2;
        starscount = 2 * n - 2;

        for (int row = 0; row < 2; row++)
        {
            System.out.print(repeat(star,starscount));
            System.out.print(repeat(space,spacescount));
            spacescount += 2;
            starscount -= 2;
            System.out.println();
        }

        //middlebottom2

        spacescount = 2;
        starscount = 2 * n - 2;

        for (int row = 0; row < 2; row++)
        {
            System.out.print(repeat(space,spacescount));
            System.out.print(repeat(star,starscount));
            if (spacescount > 0 && starscount > 0)
            {
                spacescount -= 2;
                starscount += 2;
            }
            System.out.println();
        }



        //bottom

        spacescount = 2;
        starscount = 2 * n - 2;

        for (int row = 0; row < n; row++)
        {
            System.out.print(repeat(star,starscount));
            System.out.print(repeat(space,spacescount));
            spacescount += 2;
            starscount -= 2;
            System.out.println();
        }

    }
}


