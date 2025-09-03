package com.codeptit.basic;

import java.util.Scanner;

public class J01007 {
    static boolean isFibo(long n) {
        if (n == 0 || n == 1)
            return true;
        long a = 0, b = 1;
        while (b < n) {
            long c = a + b;
            a = b;
            b = c;
        }
        return b == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            if (isFibo(n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
