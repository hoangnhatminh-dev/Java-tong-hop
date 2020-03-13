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
public class Circle2 {
    private double radius;
    
    public Circle2(){
        radius = 1.0;
    }
    
    public Circle2(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    
    public double getCircumference(){
        return radius*2*Math.PI;
    }
    
    @Override
    public String toString(){
        return "Circle[radius = " + radius + "]";
    }
}
