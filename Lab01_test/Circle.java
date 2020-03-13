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
public class Circle {
    private double radius;
    private String color;
    
    public Circle(){
        radius = 1.0;
        color = "red";
    }
    
    public Circle(double r){
        radius = r;
        color = "red";
    }
    
    public Circle (double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    
    public String getColor(){
        return "The color of Circle is: " + this.color;
    }
    
    public void setRadius (double radius){
        this.radius = radius;
    }
    
    public void setColor (String color){
        this.color = color;
    }
    
    @Override
    public String toString(){
        return "Circle[radius = " + radius + " color = " + color + "] ";
    }
    
}
