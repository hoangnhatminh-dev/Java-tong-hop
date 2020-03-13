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
public class TestBook2 {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        
        authors[0] = new Author("Tomato","tomato@gmail.com",'m');
        authors[1] = new Author("Potato","potato@gmail.com",'f');

        Book2 b2 = new Book2("Tomato&Potato", authors,200000, 200);
        
        System.out.println("Name of the book: " + b2.getName());
        System.out.println("Price of the book: " + b2.getPrice());
        System.out.println("Number of the book: " + b2.getQty());
        System.out.println(b2);


        b2.setPrice(300000);
        b2.setQty(40);
        
        System.out.println(b2);
    } 
}
