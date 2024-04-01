//https://codeforces.com/problemset/problem/50/A

package _50;

import java.util.Scanner;

public final class A
{
    public A() { }

    public static void main(final String[] args)
    {
        final Scanner scan = new Scanner(System.in);

        System.out.println(scan.nextInt() * scan.nextInt() / 2);

        scan.close();
    }
}