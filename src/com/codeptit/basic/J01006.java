package com.codeptit.basic;

import java.util.Scanner;

class Fibonacci{
    static long fibo(long n){
        if(n <= 0) return 0;
        if(n == 1 || n == 2){
            return 1;
        }
        long prev2 = 1; 
        long prev1 = 1; 
        for(long i = 3; i <= n; i++){
            long current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
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
