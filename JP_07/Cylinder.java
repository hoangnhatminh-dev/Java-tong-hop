/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_07;

/**
 *
 * @author rough
 */
public class Cylinder extends Circle{
    private double height;
    
    public Cylinder(){
        super();
        this.height = 1.0;
        System.out.println("Constructed a Cylinder with Cylinder()");
        
    }
    
    public Cylinder(double height){
        super();
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder()");
    }
    
    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder()");
    }
    
    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder()");
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
    
    public double getArea(){
        return 2*Math.PI*getRadius()*height + 2*super.getArea();
    }
    
    
    
    
}
