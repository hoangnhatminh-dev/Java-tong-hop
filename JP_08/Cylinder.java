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
public class Cylinder extends Circle {
    private double height;
    
    public Cylinder(){
        super();
        height = 1.0;
    }
    
    public Cylinder(double radius){
        super(radius);
        height = 1.0;
    }
    
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    
    public Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height = height;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double getVolume(){
        return getArea()*height;
    }
    
    @Override
    public String toString(){
        return "Cylinder[" + super.toString() + ", height = " + height + "]";
    }

}
