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
abstract public class Shape {
    protected String color;
    protected boolean filled;
    
    public Shape(){
        color = "red";
        filled = true;
    }
    
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean isFilled(){
        return this.filled;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
    
    @Override
    public String toString(){
        return "Shape[color = " + this.color + ", filled = " + this.filled;
    }

}
