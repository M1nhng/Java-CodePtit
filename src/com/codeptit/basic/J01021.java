package com.codeptit.basic;

import java.util.Scanner;

public class J01021 {
    static final long MOD = 1000000007;

    static long powMod(long a, long b) {
        long res = 1;
        a %= MOD;
        while (b > 0) {
            if (b % 2 == 1) {
                res = (res * a) % MOD;
            }
            a = (a * a) % MOD;
            b /= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        long b;
        do {
            a = scanner.nextInt();
            b = scanner.nextLong();
            if (a == 0 && b == 0) {
                break;
            }
            System.out.println(powMod(a, b));
        } while (a != 0 || b != 0);
    }
}
