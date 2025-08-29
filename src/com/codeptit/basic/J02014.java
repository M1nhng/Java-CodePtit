package com.codeptit.basic;
import java.util.*;
class DiemCanBang{
    static void check(ArrayList<Integer> list){
        int total = 0;
        int leftSum = 0, rightSum = 0;
        for(int i = 0; i < list.size(); i++){
            list.get(i);
            total += Integer.valueOf(i);
            rightSum = total - leftSum - list.get(i); 
            leftSum += list.get(i);
            if(leftSum == rightSum){
                for(int k = 0; k < list.size(); k++){
                    System.out.println(list.get(k));
                }
            }
        }
        
    }
}
public class J02014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> list = new ArrayList<>();
        while(t-- > 0){
            int n = Integer.parseInt(scanner.nextLine());
            if (n % 2 == 1) {
                for (int i = 0; i < n; i++) {
                    list.add(scanner.nextInt());
                }
                DiemCanBang.check(list);
            } else {
                System.out.println("-1");
            }
        }
        
        }
}
