package com.codeptit.mang;

import java.util.*;

// class ThuGonDaySo {
//     static int thuGon(ArrayList<Integer> list) {
//         Stack<Integer> st = new Stack<>();
//         for (int x : list) {
//             if (!st.isEmpty() && (st.peek() + x) % 2 == 0) {
//                 st.pop(); 
//             } else {
//                 st.push(x);
//             }
//         }
//         return st.size(); 
//     }
// }

// public class J02017 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         ArrayList<Integer> list = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             list.add(scanner.nextInt());
//         }
//         System.out.println(ThuGonDaySo.thuGon(list));
//     }
// }
public class J02017{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Integer> st = new Stack<>();
        int x;
        while (n-- > 0) {
            x = scanner.nextInt();
            if (!st.empty() && (x + st.peek()) % 2 == 0) {
                st.pop();
            } else
                st.push(x);
        }
        System.out.println(st.size());


    }
}