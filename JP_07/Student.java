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
public class Student extends Person {
    private int numCourses;
    private String[] courses;
    private int[] grades;
    private static final int max = 30;
    
    public Student(String name, String address){
        super(name, address);
        numCourses = 0;
        courses = new String[max];
        grades = new int[max];
    }
    
    public void addCourseGrade(String course, int grade){
        courses[numCourses] = course;
        grades[numCourses] = grade;
        ++numCourses;
    }
    
    public void printGrades(){
        System.out.println(this);
        for(int i = 0; i < numCourses; i++){
            System.out.println(" " + courses[i] + ":" + grades[i]);
        }
        System.out.println();
    }
    
    public double getAverageGrade(){
        int sum = 0;
        for (int i = 0; i < numCourses; i++){
            sum += grades[i];
        }
        return (double)sum/numCourses;
    }
    
    @Override
    public String toString(){
        return "Student: " + super.getName() + ", " + super.getAddress();
    }
    
}
