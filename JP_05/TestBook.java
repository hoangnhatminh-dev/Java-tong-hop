/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_05;

/**
 *
 * @author rough
 */
public class TestBook {
    public static void main(String[] args) {
        Author a2 = new Author("HM","HM@gmail.com",'m');
        Book b1 = new Book("Bird", a2, 29.90, 1000);
        
        System.out.println(b1.getName());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getPrice());
        System.out.println(b1.getQty());
        
        b1.setPrice(49.99);
        b1.setQty(2000);
        
        System.out.println(b1.toString());
        
    }
}
