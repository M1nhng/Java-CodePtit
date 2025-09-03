package com.codeptit.basic;

import java.util.Scanner;

class Prime {
    static boolean check(long n) {
        if (n < 2)
            return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

public class J01014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            long n = scanner.nextLong();
            long ans = -1;

            for (long i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (Prime.check(i))
                        ans = Math.max(ans, i);
                    if (Prime.check(n / i))
                        ans = Math.max(ans, n / i);
                }
            }

            if (Prime.check(n))
                ans = n;

            System.out.println(ans);
        }
    }
}
