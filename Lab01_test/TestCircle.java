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
public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(); //Dua tren constructor cua Circle co san
        System.out.println("The circle has radius of " 
                + c1.getRadius() + " and area of " + c1.getArea());
        
        Circle c2 = new Circle(2.0); //Dua tren constructor cua Circle voi radius = 2.0
        System.out.println("The circle has radius of " 
                + c2.getRadius() + " and area of " + c2.getArea());
        
        Circle c4 = new Circle();
        c4.setRadius(5.0); //Set radius moi cua Circle = 5.0
        System.out.println("Radius is " + c4.getRadius());
        
        c4.setColor("blue"); //Set color moi cua Circle = blue
        System.out.println("Color is" + c4.getColor());
        
        System.out.println(c1.toString());
        
        Circle c5 = new Circle(1.2);
        //3 cach goi toString()
        System.out.println(c5.toString());
        System.out.println(c5);
        System.out.println("Operator " + " invokes toString() too: " + c5);
    
    }
    
    
    
}
