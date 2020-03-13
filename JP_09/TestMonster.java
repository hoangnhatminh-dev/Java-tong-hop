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
public class TestMonster {
    public static void main(String[] args) {
        Monster m1 = new FireMonster("F");
        Monster m2 = new WaterMonster("W");
        Monster m3 = new StoneMonster("S");
        
        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());
        
        m1 = new StoneMonster("S2");
        
        System.out.println(m1.attack());
        
        
    }
}
