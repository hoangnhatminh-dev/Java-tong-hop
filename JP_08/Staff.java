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
public class Staff extends Person{
    private String school;
    private double pay;
    
    public Staff(String name, String address, String school, double pay){
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    
    public String getSchool(){
        return this.school;
    }
    
    public void setSchool(String school){
        this.school = school;
    }
    
    public double getPay(){
        return this.pay;
    }
    
    public void setPay(double pay){
        this.pay = pay;
    }
    
    @Override
    public String toString(){
        return "Staff[Person[name = " + super.getName() + ", address = " + super.getAddress()
                + ", school = " + this.school + ", pay = " + this.pay + "]";
    }
}
