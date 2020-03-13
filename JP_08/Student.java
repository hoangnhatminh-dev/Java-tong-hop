/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_08;

/**
 *
 * @author rough
 */
public class Student extends Person {
    private String program;
    private int year;
    private double fee;
    
    public Student(String name, String address, String program, int year, double fee){
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    
    public String getProgram(){
        return this.program;
    }
    
    public void setProgram(String program){
        this.program = program;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public double getFee(){
        return this.fee;
    }
    
    public void setFee(double fee){
        this.fee = fee;
    }
    
    @Override
    public String toString(){
        return "Student[Person[name = " + super.getName() + ", address = " + super.getAddress()
                + "], program = " + this.program + ", year = " + this.year + ", fee = " + this.fee + "]";
    }
    
    
}
