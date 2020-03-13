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
public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem item = new InvoiceItem();
        
        InvoiceItem item1 = new InvoiceItem("B01","Tivi",50,6000);
        System.out.println("The item id is: " + item1.getID());
        System.out.println("The item desc is: " + item1.getDesc());
        System.out.println("The item quantity is: " + item1.getQty());
        System.out.println("The item unit price is: " + item1.getUnitPrice());
        System.out.println("The item total is: " + item1.getTotal());
        System.out.println(item1.toString());
        
        InvoiceItem item2 = new InvoiceItem("B02","Phone",0,0);
        item2.setQty(100);
        item2.setUnitPrice(5000);
        System.out.println("The item id is: " + item2.getID());
        System.out.println("The item desc is: " + item2.getDesc());
        System.out.println("The item quantity is: " + item2.getQty());
        System.out.println("The item unit price is: " + item2.getUnitPrice());
        System.out.println("The item total is: " + item2.getTotal());
        System.out.println(item2.toString());
    }
}
