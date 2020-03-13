/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_07;

/**
 *
 * @author rough
 */
public class TestCylinder {
    public static void main(String[] args) {

        Cylinder b1 = new Cylinder();

        System.out.println("Radius is: " + b1.getRadius()
                + ", height is: " + b1.getHeight()
                + ", color is: " + b1.getColor()
                + ", base area is: " + b1.getArea()
                + ", volume is: " + b1.getVolume()
        );
        
        Cylinder b2 = new Cylinder(5.0, 2.0);
                System.out.println("Radius is: " + b2.getRadius()
                + ", height is: " + b2.getHeight()
                + ", color is: " + b2.getColor()
                + ", base area is: " + b2.getArea()
                + ", volume is: " + b2.getVolume()
        );
        
    }
}
