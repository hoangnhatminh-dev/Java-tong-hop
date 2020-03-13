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
public class TestInvoice {
    public static void main(String[] args) {
        Customer c1 = new Customer (01, "Hoang", 10);
        Customer c2 = new Customer (02, "Nhat", 20);
        Invoice i1 = new Invoice(100, c1, 50000);
        
        System.out.println(i1.getID());
        System.out.println(i1.getCustomer());
        System.out.println(i1.getAmount());
        System.out.println(i1.getCustomerName());
        i1.setCustomer(c2);
        
        i1.setAmount(100000);
        System.out.println(i1.getAmountAfterDiscount());
    }
}
