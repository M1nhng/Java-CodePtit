package com.codeptit.basic;

import java.util.Scanner;

class Fibonacci {
    static long fibo(long n) {
        if (n <= 0)
            return 0;
        if (n == 1 || n == 2) {
            return 1;
        }
        long prevnum_1 = 1;
        long prevnum_2 = 1;
        for (long i = 3; i <= n; i++) {
            long total = prevnum_1 + prevnum_2;
            prevnum_2 = prevnum_1;
            prevnum_1 = total;
        }
        return prevnum_1;
    }
}
public class J01006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t > 0){
            t--;
            long num = scanner.nextLong();
            if (num > 92) {
                System.out.println(Fibonacci.fibo(92));
            } else {
                System.out.println(Fibonacci.fibo(num));
            }
        }
        scanner.close();
    }
}
