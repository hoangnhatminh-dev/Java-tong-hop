/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_04;

/**
 *
 * @author rough
 */
public class TestCustomer {
    public static void main(String[] args) {
        Customer c1 = new Customer(01, "Hoang", 5);
        
        System.out.println(c1.getID());
        System.out.println(c1.getName());
        System.out.println(c1.getDiscount());
        
        c1.setDiscount(10);
        
        System.out.println(c1.toString());
        
    }
}
