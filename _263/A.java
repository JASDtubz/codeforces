//https://codeforces.com/problemset/problem/263/A

package _263;

import java.util.Scanner;

public final class A
{
    public A() { }

    public static void main(final String[] args)
    {
        final Scanner scan = new Scanner(System.in);

        int c = 0;

        for (int x = 0; x < 5; ++x)
        {
            for (int y = 0; y < 5; ++y)
            {
                if (scan.nextInt() == 1) { c = Math.abs(x - 2) + Math.abs(y - 2); }
            }
        }

        System.out.print(c);

        scan.close();
    }
}