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
public class Square extends ShapeRectangle{
    private double side;
    
    public Square(){
        super();
        this.width = side;
        this.length = side;
    }
    
    public Square(double side){
        super();
        this.side = side;
    }
    
    public Square(double side, String color, boolean filled){
        
    }
}
