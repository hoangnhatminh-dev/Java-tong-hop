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
public class ShapeRectangle extends Shape {
    private double width;
    private double length;
    
    public ShapeRectangle(){
        super();
        width = 1.0;
        length = 1.0;
    }
    
    public ShapeRectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
    
    public ShapeRectangle(double width, double length, String color, boolean filled){
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
    
    public double getArea(){
        return this.width * this.length;
    }
    
    public double getPerimeter(){
        return (this.width + this.length) * 2;
    }
    
    @Override
    public String toString(){
        return "Rectangle[Shape[color = " + super.getColor()
                + ", filled = " + super.isFilled()
                + ", length = " + this.length 
                + ", width = " + this.width + "]";
    }
}
