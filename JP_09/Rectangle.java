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
public class Rectangle extends Shape{
    private int length, width;
    
    public Rectangle(String color, int length, int width){
        super(color);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public String toString(){
        return "Rectangle[length = " + this.length + ", width = " + this.width
                + "," + super.toString() + "]";
    }
    
    @Override
    public double getArea(){
        return length*width;
    }
}
