/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab01;

/**
 *
 * @author rough
 */
public class Circle {
    private double radius;
    private String color;
    private double area;
    
    
    public Circle(){
        radius = 5;
        color = "blue";
        System.out.println("Demo for Circle class. Radius is: " + radius
        + " Color is " + color);
    }
    
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
        
    }
    
    public Circle (double radius){
        this.radius = radius;
    }
    
    public Circle (String color){
        this.color = color;
    }
    
    
    /**
     * Lay radius
     * @return 
     */
    public double getRadius(){
        return radius;
    }
    
    /**
     * Lay color
     * @return 
     */
    public String getColor(){
        return color;
    }
    
    /**
     * Lay area
     * @return 
     */
    public double getArea(){
        return radius *radius * Math.PI;
    }

    /**
     * Tra ve day du thong tin cua doi tuong
     * @return 
     */
    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + ", area=" + area + '}';
    }
    
    
}
