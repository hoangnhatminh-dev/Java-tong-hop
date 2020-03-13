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
public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author ("JK", "JK@gmail.com", 'f');
        System.out.println(a1);
        
        a1.setEmail("JK123@gmail.com");
        
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        System.out.println(a1.getGender());
        
        System.out.println(a1.toString());
    }
}
