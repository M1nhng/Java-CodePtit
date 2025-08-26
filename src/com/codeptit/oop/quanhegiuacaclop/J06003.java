package com.codeptit.oop.quanhegiuacaclop;

import java.util.*;
public class J06003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Infor> infor = new ArrayList<>();
        int N = 0, M = 0;
        N = Integer.parseInt(scanner.next());
        M = Integer.parseInt(scanner.next());
        scanner.nextLine();

        for(int i = 0; i <= N; i++){ 
            infor.add(new Infor(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextInt()));
        }

        ArrayList<String> exercise = new ArrayList<>();
        for(int i = 1; i <= M; i++){
            exercise.add(scanner.nextLine());
        }

        int q = Integer.parseInt(scanner.nextLine());
        while (q-- > 0) {
            int index = Integer.parseInt(scanner.nextLine());
            System.out.println(String.format("DANH SACH NHOM %d:", index));
            infor.forEach(e -> {
                if (e.nhom == index)
                    System.out.println(e);
            });
            System.out.println(String.format("Bai tap dang ky: %s", exercise.get(index - 1)));
        }
        scanner.close();
    }
}

class Infor {
    private String msv;
    private String name;
    private String sdt;
    int nhom;

    public Infor(String msv, String name, String sdt, int nhom) {
        this.msv = msv;
        this.name = name;
        this.sdt = sdt;
        this.nhom = nhom;
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + sdt;
    }

}

