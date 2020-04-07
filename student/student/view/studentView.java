package student.view;

import student.controller.studentController;
import student.model.Student;

import java.util.Scanner;

public class studentView {
    private static Scanner scanner = new Scanner(System.in);
    private static studentController sc = new studentController(1000,"Nguyen Van A","10000KD","1234567890");

    public static void main(String[] args) {
        boolean exit = false;
        menu();
        while (!exit) {
            System.out.println("\nEnter action:");
            int y = scanner.nextInt();
            scanner.nextLine();
            switch (y){
                case 1:
                    addStudent();
                    break;
                case 2:
                    sc.displayStudent();
                    break;
                case 3:
                    sc.saveStudent();
                    break;
                case 4 :
                    System.out.println("\nExitting......");
                    exit = true;
                    break;
            }

        }
    }

    public static void menu(){
        System.out.println("===================================================");
        System.out.println("1. Add student records");
        System.out.println("2. Display student records");
        System.out.println("3. Save");
        System.out.println("4. Exit");
    }


    public static void addStudent(){

        System.out.println("Enter student ID: ");
        int student_id = scanner.nextInt();

        System.out.println("Enter student name: ");
        String student_name = scanner.next();

        System.out.println("Enter student address: ");
        String student_address = scanner.next();

        System.out.println("Enter student phone: ");
        String student_phone = scanner.next();

        Student newStudent = Student.addStudent(student_id, student_name,student_address,student_phone);

        if (sc.addNewStudent(newStudent)){
            System.out.println("New student added: id ="+student_id+" name = "+ student_name +" address = "+ student_address +" phone = "+ student_phone);
        }else {
            System.out.println("Cannot add, "+ student_id +" already on file");
        }
    }
}
