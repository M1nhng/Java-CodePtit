package com.codeptit.mang;
import java.util.*;

class BubbleSort {
    static void bubbleSort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    Collections.swap(list, j, j + 1);
                    swapped = true;
                }
            }
            // Nếu có đổi chỗ thì in kết quả bước này
            if (swapped) {
                System.out.printf("Buoc %d: ", i + 1);
                for (int k = 0; k < list.size(); k++) {
                    System.out.print(list.get(k) + " ");
                }
                System.out.println();
            }
        }
    }
}

public class J02013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // số phần tử
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        BubbleSort.bubbleSort(list);
        scanner.close();
    }
}
