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
public class TestBook {
    public static void main(String[] args) {
        Author a3 = new Author ("Banana", "banana@gmail.com",'f');
        System.out.println(a3);
        Book b1 = new Book("HP",a3,100000, 100);
        
        System.out.println("Name of the book: " + b1.getName());
        System.out.println("Price of the book: " + b1.getPrice());
        System.out.println("Number of the book: " + b1.getQty());
        System.out.println(b1);

        System.out.println("Name of the author: " + b1.getAuthor().getName());
        System.out.println("Email of the author: " + b1.getAuthor().getEmail());
        System.out.println("Gender of the author: " + b1.getAuthor().getGender());
        System.out.println("Author or the book: " + b1.getAuthor());
        
        b1.setPrice(200000);
        b1.setQty(50);
        
        System.out.println(b1);
        
        
    }
}
