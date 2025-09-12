package com.vti.Bai7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();

        System.out.println("Nhập số lượng sinh viên trong danh sách: ");
        int studentNumber = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < studentNumber; i++){
            System.out.println("Nhập tên sinh viên: ");
            String studentName = scanner.nextLine();
            System.out.println("Nhập điểm: ");
            double studentScore = scanner.nextDouble();
            scanner.nextLine();
            Student student = new Student(studentName, studentScore);
            studentList.add(student);
        }

        System.out.println("Danh sách sinh viên: ");
        for (Student student : studentList){
            System.out.println(student);
        }
    }
}
