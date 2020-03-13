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
public class TestMovable {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(1,2);
        System.out.println(p1);
        
        p1.moveDown();
        System.out.println(p1);
        p1.moveLeft();
        System.out.println(p1);
        p1.moveRight();
        System.out.println(p1);
        p1.moveUp();
        System.out.println(p1);
    }
}
