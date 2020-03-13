/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_10;

/**
 *
 * @author rough
 */
public class InterfaceRectangle implements InterfaceShape {
    private int length, width;
    
    public InterfaceRectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    
    @Override
    public String toString(){
        return "Rectangle[length = " + this.length + ", width = " + this.width + "]";
    }
    
    @Override
    public double getArea(){
        return length * width;
    }
}
