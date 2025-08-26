package com.codeptit.basic;

import java.util.Scanner;
class checknum{
    //euclid tim ucln
    // long gcd(long a, long b) {
    //     if (a == 0 && b == 0) {
    //         return a + b;
    //     }
    //     while(a != b){
    //         if(a > b){
    //             a = a - b;
    //         }else b = b - a;
    //     }
    //     return a;
    // }

    //de quy
    long gcd(long a, long b){
        if(b == 0){
            return a;
        }else{
            return gcd(b, a % b); //de quy
        }
    }
    
    long lcm(long a, long b){
        if (a == 0 || b == 0) return 0;
        long g = gcd(a, b);
        return Math.abs(a / g * b);
    }
}
public class J01011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        checknum util = new checknum();
        for(int i = 0; i < t; i++){
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long g = util.gcd(a, b);
             long l = util.lcm(a, b);
            // System.out.println(g);
           System.out.println(l + " " + g);
        }
        scanner.close();
    }
}
