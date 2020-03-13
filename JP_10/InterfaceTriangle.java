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
public class InterfaceTriangle implements InterfaceShape {
    private int base, height;
    
    public InterfaceTriangle(int base, int height){
        this.base = base;
        this.height = height;
    }
    
    @Override
    public String toString(){
        return "Triangle[base = " + this.base + ", height = " + this.height+ "]";
    }
    
    @Override
    public double getArea(){
        return 0.5 * base * height;
    }
}
