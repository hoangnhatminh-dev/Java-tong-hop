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
public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(2,5,10);
        c1.getRadius();
        c1.setRadius(12);
        c1.setCenterX(5);
        c1.setCenterY(7);
        c1.getCenterX();
        c1.getCenterY();
        System.out.println(c1.toString());
        System.out.println(c1.getArea());
        System.out.println(c1.getCirumference());
        
        MyPoint m1 = new MyPoint(5,6);
        MyCircle c2 = new MyCircle(m1, 8);
        System.out.println(c2.toString());
        System.out.println(c1.distance(c2));
        
    }
}
