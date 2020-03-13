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
public class TestCircle {
    public static void main(String[] args) {
       Circle c1 = new Circle();
       System.out.println(c1.toString());
       
       Circle c2 = new Circle(5, "blue");
        System.out.println(c2.toString());
        System.out.println(c2.getArea());
        System.out.println(c2.getColor());
        System.out.println(c2.getRadius());
        
        c2.setRadius(10);
        c2.setColor("red");
        
        System.out.println(c2.toString());
    
     
    }
    
}
