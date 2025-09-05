package com.codeptit.oop.quanhegiuacaclop;
import java.util.*;

public class J06003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // so sinh vien
        int m = scanner.nextInt(); // so nhom
        scanner.nextLine();
        ArrayList<Infor> student = new ArrayList<>();

        if (n > m) {
            final boolean check = true;
        }

        while(n-- > 0){
            student.add(new Infor(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextInt()));
        }
        
        ArrayList<String> exercise = new ArrayList<>();   
        for(int i = 1; i <= m; i++){
            exercise.add(scanner.nextLine());
        }
        int q = Integer.parseInt(scanner.nextLine());
        while(q--> 0){
            
        }
        
        
    }
}

class Infor{
    private String id;
    private String name;
    private String phone;
    private int group;

    public Infor(String id, String name, String phone, int group){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.group = group;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + phone + " ";
    }
    
}