/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab01;

/**
 *
 * @author rough
 */
public class TestProduct {
    public static void main(String[] args) {
        Product product1 = new Product(1,"LCD",2500,50,"Man hinh LCD");
        
        System.out.println("The product name is" + product1.getName() + " price is " + product1.getPrice());
        System.out.println("The product " + product1.getName() + " quantity is " + product1.getQty());
        System.out.println("The product " + product1.getName() + " from " + product1.getPrice()  + " new price is " + product1.setPrice(5000));
        
        System.out.println(product1.toString());
        
        
    }
}
