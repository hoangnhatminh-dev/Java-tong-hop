/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab02;

/**
 *
 * @author rough
 */
public class TestStudent {
    public static void main(String[] args) {
        Student studentA = new Student(1,"Nguyen Van A",true);
        Student studentB = new Student(2,"Nguyen Van B",false);
        
        System.out.println(studentA.toString());
        
        System.out.println(studentB.toString());
        studentB.setName("Nguyen Van C");
        System.out.println(studentB.toString());
        
        

        
    }
}
