package com.codeptit.mang;
import java.util.Scanner;
public class J02007{
    public static Scanner sc = new Scanner(System.in);
    public static void testcase(int t){
        int n = sc.nextInt();
        int[] a = new int[n];
        int [] dd = new int[1000001];
        System.out.printf("Test %d: \n",t);
        for(int i = 0; i<n;i++){
            a[i] = sc.nextInt();
            dd[a[i]]++;
        }
        for(int i=0;i<n;i++){
            if(dd[a[i]]>0){
                System.out.printf("%d xuat hien %d lan \n",a[i],dd[a[i]]);
                dd[a[i]]=0; // tranh lap lai
            }
        }
    }
    public static void main(String [] args){
        int tc = sc.nextInt();
        int t = 0;
        while(t< tc){
            testcase(t+1);
            t++;
        }
    }
}