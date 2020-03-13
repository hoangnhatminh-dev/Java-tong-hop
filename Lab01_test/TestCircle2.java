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
public class TestCircle2 {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2();
        System.out.println("Circle radius is: " + c1.getRadius());
        c1.setRadius(5.5);
        System.out.println("Circle radius is: " + c1.getRadius());
        System.out.println("Circle area is: " + c1.getArea());
        System.out.println("Circle circumference is: " + c1.getCircumference());
        System.out.println(c1.toString());
        
        Circle2 c2 = new Circle2(3.0);
        System.out.println("Circle radius is: " + c2.getRadius());
        System.out.println("Circle area is: " + c2.getArea());
        System.out.println("Circle circumference is: " + c2.getCircumference());
        System.out.println(c2.toString());
        
        
    
                
    }
}
