package com.codeptit.mang;

import java.util.Scanner;

public class J02106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[][] = new int [n][3];
        int sum = 0;

        for(int i = 0; i < n; i++){
            int cnt_1 = 0;
            int cnt_0 = 0;
            for(int j = 0; j < 3; j++){
                a[i][j] = scanner.nextInt();
                if(a[i][j] == 1){
                    cnt_1++;
                }else cnt_0++;
            }
            if(cnt_1 > cnt_0){
                sum++;
            }
            
        }     
        System.out.println(sum);        
    }
}
