/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_08;

/**
 *
 * @author rough
 */
public class Circle {
    private double radius;
    private String color;
    
    public Circle(){
        radius = 1.0;
        color = "red";
    }
    
    public Circle(double radius){
        this.radius = radius;
        color = "red";
    }
    
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public double getArea(){
        return radius*radius*Math.PI;
    }
    
    @Override
    public String toString(){
        return "Circle[radius = " + this.radius + ", color = " + this.color + "]";
    }
}
