/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_04;

/**
 *
 * @author rough
 */
public class TestTriangle {
    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(1,2,3,4,5,6);
        
        MyPoint v1 = new MyPoint(2,4);
        MyPoint v2 = new MyPoint(6,8);
        MyPoint v3 = new MyPoint(8,10);
        
        MyTriangle t2 = new MyTriangle(v1,v2,v3);
        
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        
        System.out.println(t1.getPerimeter());
        System.out.println(t1.getType());
        
        System.out.println(t2.getPerimeter());
        System.out.println(t2.getType());
    }
    
    
    
}
