/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_09;

/**
 *
 * @author rough
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Cylinder(1.1,2.2);
        
        System.out.println(c1.getRadius());
        System.out.println(c1.toString());
        System.out.println(c1.getArea());
    }
}
