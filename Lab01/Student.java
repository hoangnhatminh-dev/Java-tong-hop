/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab01;

/**
 *
 * @author rough
 */
public class Student {
    private String name;
    private double gpa;
    
    public Student(){
        System.out.println("Demo for Student Class");
    }
    
    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }
    
    public void getName(){
        System.out.println("The student's name is: " + name);
    }
    
    public void setGPA(){
        System.out.println("The student's GPA is: " + gpa);
    }
}

