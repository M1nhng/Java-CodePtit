package com.codeptit.xaukytu;

import java.util.Scanner;
import java.util.TreeSet;

public class J03009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-->0){
            String s[] = scanner.nextLine().trim().split("\\s+");
            TreeSet<String> set1 = new TreeSet<>();
            TreeSet<String> set2 = new TreeSet<>();
            String s1[] = scanner.nextLine().trim().split("\\s+");

            for(int i = 0; i < s.length; i++){
                set1.add(s[i]);
            }

            for (int i = 0; i < s1.length; i++) {
                set2.add(s1[i]);
            }

            set1.removeAll(set2);
            for (String string : set1) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}
