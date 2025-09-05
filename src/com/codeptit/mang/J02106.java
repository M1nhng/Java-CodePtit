package com.codeptit.mang;

import java.util.Scanner;

public class J02106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
       
            int n = scanner.nextInt();
            String s[] = new String[n];
            int count = 0;
            for(int i = 0; i < n; i++){
                s[i] = scanner.nextLine();
                int cnt = 0;
                for(int x = 0; x < s[i].length(); x++){
                    if(s[i].charAt(x) == '1'){
                        cnt++;
                    }
                }
                if(cnt > 3 - cnt) count ++;
            }
            System.out.println(count);
    }
}
