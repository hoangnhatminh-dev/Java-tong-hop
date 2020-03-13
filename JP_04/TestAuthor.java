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
public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author();
        System.out.println(a1);
        
        Author a2 = new Author("JK","JK@gmail.com", 'f');
        System.out.println(a2);
        System.out.println("Name of the author: " + a2.getName());
        System.out.println("Email of the author: " + a2.getEmail());
        System.out.println("Gender of the author: " + a2.getGender());
        
        a2.setEmail("JKN@gmail.com");
        System.out.println(a2);
    }
}
