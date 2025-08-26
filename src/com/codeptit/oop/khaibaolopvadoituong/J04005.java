package com.codeptit.oop.khaibaolopvadoituong;

import java.util.Scanner;

public class J04005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String dob = scanner.nextLine();
        float sc1 = scanner.nextFloat();
        float sc2 = scanner.nextFloat();
        float sc3 = scanner.nextFloat();
        float sum = sc1 + sc2 + sc3;
        System.out.println(name + " " + dob + " " + sum);
        scanner.close();
    }
}
