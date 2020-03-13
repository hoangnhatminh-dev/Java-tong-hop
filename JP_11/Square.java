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
public class Square extends Rectangle{
    public double side;
    
    public Square(){
        super();
        this.width = side;
        this.length = side;
    }
    
    public Square(double side){
        super();
        this.side = side;
    }
    
    public Square(String color, boolean filled, double side){
        super(color,filled);
        this.side = side;
    }
    
    public double getSide(){
        return this.side;
    }
    
    public void setSide(double side){
        this.side = side;
    }
    
    @Override
    public void setWidth(double side){
        this.side = width;
    }
    
    @Override
    public void setLength(double side){
        this.side = length;
    }
    
    @Override
    public String toString(){
        return "Square[Rectangle[Shape[color = " + super.getColor()
                + ", filled = " + super.isFilled()
                + ", width = " + super.getWidth()
                + ", length = " + super.getLength() + "]]";
    }
    
    
    
}
