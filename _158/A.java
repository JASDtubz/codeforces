//https://codeforces.com/problemset/problem/158/A

package _158;

import java.util.Scanner;

public final class A
{
    public A() { }

    public static void main(final String[] args)
    {
        final Scanner scan = new Scanner(System.in);

        final int n = scan.nextInt(), k = scan.nextInt();
        int i = 0, t = -1, c;

        for (int j = 0; j < n; ++j)
        {
            c = scan.nextInt();

            if (c > 0 && j + 1 < k || c == t && j >= k) { ++i; }
            else if (c != 0 && j + 1 == k)
            {
                t = c;
                ++i;
            }
            else { break; }
        }

        System.out.print(i);

        scan.close();
    }
}