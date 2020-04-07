package student;

import student.studentController;
import student.student;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class studentView {
    final int SENTINEL = 0;
    int n;
    Scanner scanner = new Scanner(System.in);
    studentController sc = new studentController(1000,"Nguyen Van A","10000KD","1234567890");

    public static void main(String[] args) {
        studentView views = new studentView();
        views.studentMenu();
    }

    public void studentMenu(){
        studentView views = new studentView();
        views.menu();
        int y;
        y = scanner.nextInt();
        while ( y != SENTINEL){
            switch (y){
                case 1:
                    views.addStudent();
                    break;
                case 2:
                    sc.displayStudent();
                    break;
                case 3:
                    sc.saveStudent();
                    break;
                case 4 :
                    System.exit(0); ;
                    break;
            }
            views.menu();
            y = scanner.nextInt();
        }
    }

    public void menu(){
        System.out.println("===================================================");
        System.out.println("1. Add student records");
        System.out.println("2. Display student records");
        System.out.println("3. Save");
        System.out.println("4. Exit");
    }


    public void addStudent(){

        System.out.println("Enter student ID: ");
        int student_id = scanner.nextInt();

        System.out.println("Enter student name: ");
        String student_name = scanner.next();

        System.out.println("Enter student address: ");
        String student_address = scanner.next();

        System.out.println("Enter student phone: ");
        String student_phone = scanner.next();

        student newStudent = new student(student_id, student_name,student_address,student_phone);

        if (sc.addNewStudent(newStudent)){
            System.out.println("New student added: id ="+student_id+" name = "+ student_name +" address = "+ student_address +" phone = "+ student_phone);
        }else {
            System.out.println("Cannot add, "+ student_id +" already on file");
        }
    }
}
