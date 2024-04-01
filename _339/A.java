//https://codeforces.com/problemset/problem/339/A

package _339;

import java.util.Scanner;

public final class A
{
    public A() { }

    public static void main(final String[] args)
    {
        final Scanner scan = new Scanner(System.in);

        final String s = scan.nextLine();
        final int[] i = new int[3];
        char c;

        for (int j = 0; j < s.length(); j += 2)
        {
            c = s.charAt(j);

            if (c == '1') { ++i[0]; }
            else if (c == '2') { ++i[1]; }
            else { ++i[2]; }
        }

        while (i[0] + i[1] + i[2] > 0)
        {
            if (i[0] > 0)
            {
                System.out.print('1');

                --i[0];
            }
            else if (i[1] > 0)
            {
                System.out.print('2');

                --i[1];
            }
            else
            {
                System.out.print('3');

                --i[2];
            }

            if (i[0] + i[1] + i[2] == 0) { break; }

            System.out.print("+");
        }

        scan.close();
    }
}