/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab01_test;

/**
 *
 * @author rough
 */
public class TimeTest {
    public static void main(String[] args) {
        Time t1 = new Time();
        System.out.println(t1.toString());
        
        Time t2 = new Time(5,29,60);
        System.out.println("The second is: " + t2.getSecond());
        System.out.println("The minute is: " + t2.getMinute());
        System.out.println("The hour is: " + t2.getHour());
        t2.setHour(6);
        t2.setMinute(59);
        t2.setSecond(20);
        System.out.println(t2.toString());
        
        t2.setTime(7, 28, 59);
        System.out.println(t2.toString());
        
        t2.nextSecond();
        System.out.println(t2.toString());
        
        t2.previousSecond();
        System.out.println(t2.toString());
        
        t2.nextSecondLoop(0, 120);
        System.out.println(t2.toString());
        
        t2.previousSecondLoop(0, 120);
        System.out.println(t2.toString());
    }
}
