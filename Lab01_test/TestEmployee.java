/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab01_test;

/**
 *
 * @author rough
 */
public class TestEmployee {
    public static void main(String[] args) {
        Employee p = new Employee();
        System.out.println(p);
        
        Employee p1 = new Employee(1, "AB", "CD", 1000);
        System.out.println("The employee id is: " + p1.getID());
        System.out.println("The employee first name is: " + p1.getFirstName());
        System.out.println("The employee last name is: " + p1.getLastName());
        System.out.println("The employee name is: " + p1.getName());
        System.out.println("The employee salary is: " + p1.getSalary());
        System.out.println(p1.toString());
        
        Employee p2 = new Employee(2, "Meo", "Cho", 2000);
        System.out.println("The employee id is: " + p2.getID());
        System.out.println("The employee first name is: " + p2.getFirstName());
        System.out.println("The employee last name is: " + p2.getLastName());
        System.out.println("The employee name is: " + p2.getName());
        System.out.println("The employee salary is: " + p2.getSalary());
        p2.setSalary(5000);
        System.out.println("The employee salary is: " + p2.getSalary());
        System.out.println("The employee annual salary is: " + p2.getAnnualSalary());
        System.out.println("The employee after salary raise is: " + p2.raiseSalary(50));
        System.out.println(p2.toString());
    }
}
