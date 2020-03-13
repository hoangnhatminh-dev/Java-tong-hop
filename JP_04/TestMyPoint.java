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
public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint m1 = new MyPoint(6,9);
        
        System.out.println(m1.getX());
        System.out.println(m1.getY());
        
        m1.setX(9);
        m1.setY(10);
        
        System.out.println(m1.getXY()[0]);
        System.out.println(m1.getXY()[1]);
        
        m1.setXY(12,20);
        
        System.out.println(m1.toString());
        
        MyPoint m2 = new MyPoint (7,8);
        
        System.out.println(m1.distance());
        System.out.println(m1.distance(m2));
        System.out.println(m1.distance(10, 8));

    }
}
