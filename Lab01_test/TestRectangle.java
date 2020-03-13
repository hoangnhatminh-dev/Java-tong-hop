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
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("Rectangle length is: " + r1.getLength());
        System.out.println("Rectangle width is: " + r1.getWidth());
        System.out.println("Rectangle area is: " + r1.getArea());
        System.out.println("Rectangle perimeter is: " + r1.getPerimeter());
        System.out.println(r1.toString());
        
        Rectangle r2 = new Rectangle(3.0f, 4.5f);
        System.out.println("Rectangle length is: " + r2.getLength());
        System.out.println("Rectangle width is: " + r2.getWidth());
        System.out.println("Rectangle area is: " + r2.getArea());
        System.out.println("Rectangle perimeter is: " + r2.getPerimeter());
        System.out.println(r2.toString());
        
        Rectangle r3 = new Rectangle();
        r3.setLength(2.5f);
        r3.setWidth(3.5f);
        System.out.println("Rectangle length is: " + r3.getLength());
        System.out.println("Rectangle width is: " + r3.getWidth());
        System.out.println("Rectangle area is: " + r3.getArea());
        System.out.println("Rectangle perimeter is: " + r3.getPerimeter());
        System.out.println(r3.toString());
        
    }
 }
