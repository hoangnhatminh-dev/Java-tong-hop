/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_11;

/**
 *
 * @author rough
 */
public class Circle extends Shape{
    protected double radius;
    
    public Circle(){
        radius = 1.0;
    }
    
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    
    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return radius*radius*Math.PI;
    }
    
    @Override
    public double getPerimeter(){
        return 2.0 * radius * Math.PI;
    }
    
    @Override
    public String toString(){
        return "Circle[Shape[color = " + super.getColor() + ", filled = " + super.isFilled()
                + "], radius = " + this.radius + "]";
    }
}
