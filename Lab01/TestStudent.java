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
public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("Paul Lee", 3.5);
        Student student2 = new Student("Peter Tan", 3.9);
        
        student.getName();
        student.setGPA();
        
        student2.getName();
        student2.setGPA();
    }
    
}
