package com.codeptit.oop.khaibaolopvadoituong;

import java.util.Scanner;

public class J04006 {
    static class SinhVien {
        final String msv = "B20DCCN001";
        public String name;
        public String lop;
        public String dob;
        public float gpa;
        
        public SinhVien() {
            this.name = "";
            this.lop = "";
            this.dob = "";
            this.gpa = 0;
        }
        
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinhVien sv = new SinhVien();
        
        sv.name = scanner.nextLine();
        sv.lop = scanner.nextLine();
        sv.dob = scanner.nextLine();
        sv.gpa = scanner.nextFloat();

        
        System.out.printf("%s %s %s %s %.2f", sv.msv, sv.name, sv.lop, sv.dob, sv.gpa);
        scanner.close();
    }
}
