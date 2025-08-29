package com.codeptit.basic;

import java.util.Scanner;
class Cut{
    static int sol(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9'){
                return 0;
            }
            if(s.charAt(i) == '1'){
                return 0;
            }
        }
        return 1;
    }
}
public class J01010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
       
        while (t-- > 0) {
            String s = scanner.nextLine();
            
        }
    }
}
