package com.codeptit.basic;

import java.util.Scanner;
import java.io.File;
public class HELLO_FILE {
    public static void main(String[] args) {
        File file = new File("Hello.txt");
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (Exception e) {
            
        }
    }
}
