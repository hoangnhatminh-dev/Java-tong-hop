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
public class ShapeCircle extends Shape{
    private double radius;
    
    public ShapeCircle(){
        super();
        radius = 1.0;
    }
    public ShapeCircle(double radius){
        super();
        this.radius = radius;
    }
    
    public ShapeCircle(double radius, String color, boolean filled){
        super(color,filled);
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
    
    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }
    
    @Override
    public String toString(){
        return "Circle[Shape[color = " + super.getColor()
                + ", filled = " + super.isFilled()
                + ", radius = " + this.radius + "]";
    }
    
}
