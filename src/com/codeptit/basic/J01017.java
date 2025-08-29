package com.codeptit.basic;

import java.util.*;

public class J01017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            boolean check = true;
            String s = scanner.nextLine();
            for(int i = 0; i < s.length() - 1; i++){
                if(Math.abs(s.charAt(i) - s.charAt(i + 1)) != 1){
                    check = false;
                    break;
                }   
            }

            if (check)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
