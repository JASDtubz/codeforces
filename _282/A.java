//https://codeforces.com/problemset/problem/282/A

package _282;

import java.util.Scanner;

public final class A
{
    public A() { }

    public static void main(final String[] args)
    {
        final Scanner scan = new Scanner(System.in);

        final int n = scan.nextInt();
        int x = 0;

        for (int i = 0; i < n; ++i)
        {
            if (scan.next().contains("+")) { ++x; }
            else { --x; }
        }

        System.out.print(x);

        scan.close();
    }
}