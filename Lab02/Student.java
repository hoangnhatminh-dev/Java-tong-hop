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
public class Student {
    private int id;
    private String name;
    private boolean gender;
    
    public Student(){
        this.id = 1;
        this.name="noname";
        this.gender=true;
    }
    
    public Student (int id, String name, boolean gender){
        this.id = id;
        this.name= name;
        this.gender = gender;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public boolean isMale(){
        return this.gender;
    }
    
    public void printInfo(){
        System.out.println("The student info is" + " id " + id
        + " name is " + name + " gender is " +gender);
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public void setMale(boolean gender){
        this.gender = gender;
    }
    
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + " id = " + id + ", name = " + name + ", gender = " + gender + '}';
    }
    
    
    
    
    
}
