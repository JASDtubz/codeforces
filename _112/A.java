//https://codeforces.com/problemset/problem/112/A

package _112;

import java.util.Scanner;

public final class A
{
    public A() { }

    public static void main(final String[] args)
    {
        final Scanner scan = new Scanner(System.in);

        int i = scan.next().toLowerCase().compareTo(scan.next().toLowerCase());

        System.out.print(i != 0 ? (i >= 1 ? 1 : -1) : i);

        scan.close();
    }
}