package com.codeptit.basic;
import java.util.*;
class InterchangeSort{
    static void interchangeSort(ArrayList<Integer> list){
        for(int i = 0; i < list.size() - 1; i++){
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(i) > list.get(j)){
                    Collections.swap(list, i, j);
                }
            }
            System.out.printf("Buoc %d: " , i + 1);
            for(int k = 0; k < list.size(); k++){
                System.out.print(list.get(k) + " ");
            }
            System.out.println();
        }
    }
}
public class J02010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> interchangeSort = new ArrayList<>();
        for(int i = 0; i < t; i++){
            interchangeSort.add(scanner.nextInt());
        }
        InterchangeSort.interchangeSort(interchangeSort);
    }
}
