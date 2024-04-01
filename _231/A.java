//https://codeforces.com/problemset/problem/231/A

package _231;

import java.util.Scanner;

public final class A
{
    public A() { }

    public static void main(final String[] args)
    {
        final Scanner scan = new Scanner(System.in);

        final int n = scan.nextInt();
        int c = 0;

        for (int i = 0; i < n; ++i)
        {
            if (scan.nextInt() + scan.nextInt() + scan.nextInt() > 1) { ++c; }
        }

        System.out.print(c);

        scan.close();
    }
}