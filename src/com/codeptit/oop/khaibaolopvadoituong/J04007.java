package com.codeptit.oop.khaibaolopvadoituong;

import java.util.Scanner;

public class J04007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String id = "00001";
        String name = scanner.nextLine();
        String gender = scanner.nextLine();
        String dob = scanner.nextLine();
        String address = scanner.nextLine();
        String mst = scanner.nextLine();
        String date = scanner.nextLine();
        System.out.println(id + " " + name + " " + gender + " " + dob + " " + address + " " + mst + " " + date);
        scanner.close();
    }
}
