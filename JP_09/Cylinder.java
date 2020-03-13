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
public class Cylinder extends Circle{
    private double height;
    
    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }
    
    public double getheight(){
        return this.height;
    }
    
    public double getVolume(){
        return super.getArea() * this.height;
    }
    
    @Override
    public double getArea(){
        return  getRadius() * this.height * 2.0 * Math.PI;
    }
    
    @Override
    public String toString(){
        return "Cylinder[height = " + this.height + "," + super.toString() + "]";
    }
}
