package com.codeptit.xaukytu;
import java.util.*;
public class J03004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- > 0){
            String s = scanner.nextLine().trim().toLowerCase();
                String a[] = s.split("\\s+");
                for (String string : a) {
                    System.out.print(String.valueOf(string.charAt(0)).toUpperCase() + string.substring(1).toLowerCase() + " ");
                }
                System.out.println();
            }
            
        scanner.close();
    }
}

