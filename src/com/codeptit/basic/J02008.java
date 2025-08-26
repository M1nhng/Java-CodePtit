package com.codeptit.basic;
import java.util.*;
public class J02008{
    public static Scanner sc = new Scanner(System.in);

    public static long gcd(long a, long b){
        while(b!=0){
            long x = a%b;
            a = b;
            b = x;
        }
        return a;
    }
    public static long lcm(long a,long b){
        return a*b/gcd(a,b);
    }
    public static void testcase(){
        long n = sc.nextLong();
        long res = 1;
        for(int i=2;i<=n;i++){
            res = lcm(res,i);
        }
        System.out.println(res);
    }
    public static void main(String[]args){
        int tc = sc.nextInt();
        while(tc-->0){
            testcase();
        }
    }
}