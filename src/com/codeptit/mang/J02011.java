package com.codeptit.mang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Check1 {
    static void selectionSort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(min)) {
                    min = j;
                }
            }
            Collections.swap(list, i, min);

            // In ra sau mỗi bước
            System.out.printf("Buoc %d: ", i + 1);
            for (int k = 0; k < list.size(); k++) {
                System.out.print(list.get(k) + " ");
            }
            System.out.println();
        }
    }
}

public class J02011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();  
        ArrayList<Integer> n = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            n.add(scanner.nextInt());
        }
        Check1.selectionSort(n);
        scanner.close();
    }
}
