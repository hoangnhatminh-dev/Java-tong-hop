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
public class Circle {
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }

    
    public double getRadius(){
        return this.radius;
    }
    
    public double getArea(){
        return radius*radius*Math.PI;
    }
    
    @Override
    public String toString(){
        return "Circle[radius = " + radius + "]";
    }
    
    
    
    
    
}
