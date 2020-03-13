/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_07;

/**
 *
 * @author rough
 */
public class TestPerson {
    public static void main(String[] args) {
        Student s1 = new Student("MM", "AA");
        s1.addCourseGrade("IM101", 97);
        s1.addCourseGrade("IM102", 68);
        s1.printGrades();
        System.out.println("Average is: " + s1.getAverageGrade());
        
        Teacher t1 = new Teacher("NN", "BB");
        System.out.println(t1);
        String[] courses = {"IM101", "IM102", "IM101"};
        for (String course: courses){
            if(t1.addCourse(course)){
                System.out.println(course + " added");
            }else{
                System.out.println(course + " cannot be added");
            }
        }
        
        for (String course: courses){
            if(t1.removeCourse(course)){
                System.out.println(course + "removed");
            }else{
                System.out.println(course + " cannot be removed");
            }
        }
    }
}
