//https://codeforces.com/problemset/problem/4/A

package _4;

import java.util.Scanner;

public final class A
{
    public A() { }

    public static void main(final String[] args)
    {
        final Scanner scan = new Scanner(System.in);

        final int w = scan.nextInt();

        System.out.print(w % 2 == 0 && w > 2 ? "YES" : "NO");

        scan.close();
    }
}