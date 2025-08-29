package com.codeptit.basic;

import java.util.Scanner;

class Fibonacci {
    static long fibo(long n) {
        if (n <= 0)
            return 0;
        if (n == 1 || n == 2) {
            return 1;
        }
        long num_1 = 1;
        long num_2 = 1;
        for (long i = 3; i <= n; i++) {
            long total = num_1 + num_2;
            num_2 = num_1;
            num_1 = total;
        }
        return num_1;
    }
}
public class J01007 {
    public static void main(String agrs[]){
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        Fibonacci fibonacci = new Fibonacci();
        while (t-- > 0) {
            int n = scanner.nextInt();
            if(n = Fibonacci.num_1 )
        }
    }
}
