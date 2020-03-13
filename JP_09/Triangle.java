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
public class Triangle extends Shape{
    private int base, height;
    
    public Triangle(String color, int base, int height){
        super(color);
        this.base = base;
        this.height = height;
    }
    
    @Override
    public String toString(){
        return "Triangle[base = " + this.base + ", height " + this.height
                + ", " + super.toString() + "]";
    }
    
    @Override
    public double getArea(){
        return 0.5*base*height;
    }
}
