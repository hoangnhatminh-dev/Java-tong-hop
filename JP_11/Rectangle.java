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
public class Rectangle extends Shape {
    protected double width;
    protected double length;
    
    public Rectangle(){
        super();
        width = 1.0;
        length = 1.0;
    }
    
    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
    
    public Rectangle(String color, boolean filled, double width, double length){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    
    public double getWidth(){
        return this.width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getLength(){
        return this.length;
    }
    
    public void setLength(double length){
        this.length = length;
    }
    
    @Override
    public double getArea(){
        return length * width;
    }
    
    @Override
    public double getPerimeter(){
        return (length + width) * 2;
    }
    
    @Override
    public String toString(){
        return "Rectangle[Shape[color = " + super.getColor() + ", filled = " 
        + super.isFilled() + ", width = " + this.width + ", length = " 
        + this.length + "]";
    }
}
