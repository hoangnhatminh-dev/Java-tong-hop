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
public class Rectangle {
    private float length;
    private float width;
    
    public Rectangle(){
        length = 1.0f;
        width = 1.0f;
    }
    
    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }
    
    public float getLength(){
        return this.length;
    }
    
    public void setLength(float length){
        this.length = length;
    }
    
    public float getWidth(){
        return this.width;
    }
    
    public void setWidth(float width){
        this.width = width;
    }
    
    public double getArea(){
        return this.length*this.width;
    }
    
    public double getPerimeter(){
        return (this.length+this.width)*2;
    }
    
    @Override
    public String toString(){
        return "Rectangle[length = " + this.length + ", width = " + this.width + "]";
    }
}
