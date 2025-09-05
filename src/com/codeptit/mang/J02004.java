package com.codeptit.mang;

import java.util.Scanner;

public class J02004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-->0){
            int n = scanner.nextInt();
            int a[] = new int[n];//khai bao mang
            boolean check = true;

            for(int i = 0; i < n; i++){
                a[i] = scanner.nextInt();//truy xuat phan tu trong mang
            }

            for(int i = 0; i < n / 2; i++){
                if(a[i] != a[n - i -1]){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}
