package com.codeptit.basic;
import java.util.Scanner;

class Cut {
    static String cut(char c) {
        if (c == '8' || c == '0' || c == '9') {
            return "0";
        } else if (c == '1') {
            return "1";
        } else {
            return null;
        }
    }
}
public class J01010{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            String s = sc.next();
            String res = "";
            boolean ok = true;
            for (int i = 0; i < s.length(); i++) {
                String tmp = Cut.cut(s.charAt(i));
                if (tmp == null) {
                    ok = false;
                    break;
                }
                res += tmp;
            }
            if (ok) {
                res = res.replaceFirst("^0+", "");
                if (res.isEmpty()) {
                    System.out.println("INVALID");
                } else {
                    System.out.println(res);
                }
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
    
