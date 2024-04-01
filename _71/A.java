//https://codeforces.com/problemset/problem/71/A

package _71;

import java.util.Scanner;

public final class A
{
    public A() { }

    public static void main(final String[] args)
    {
        final Scanner scan = new Scanner(System.in);

        final int n = scan.nextInt();
        final String[] words = new String[n];
        String word;

        for (int i = 0; i < n; ++i)
        {
            word = scan.next();
            words[i] = word.length() > 10 ? String.valueOf(word.charAt(0)) + (word.length() - 2) + word.charAt(word.length() - 1) : word;
        }

        for (final String s : words) { System.out.println(s); }

        scan.close();
    }
}