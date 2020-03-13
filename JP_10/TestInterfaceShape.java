/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_10;

/**
 *
 * @author rough
 */
public class TestInterfaceShape {
    public static void main(String[] args) {
        InterfaceShape s1 = new InterfaceRectangle(1,2);
        System.out.println(s1);
        System.out.println("Area is: " + s1.getArea());
        
        InterfaceShape s2 = new InterfaceTriangle(3,4);
        System.out.println(s2);
        System.out.println("Area is: " + s2.getArea());
        
    }
}
