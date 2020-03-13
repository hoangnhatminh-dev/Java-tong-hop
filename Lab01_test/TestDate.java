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
public class TestDate {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1.toString());
        
        Date d2 = new Date(22,12,2014);
        System.out.println(d2.toString());
        System.out.println("Day is: " + d2.getDay());
        System.out.println("Month is: " + d2.getMonth());
        System.out.println("Year is: " + d2.getYear());
        
        d2.setDay(32);
        System.out.println("New day is: " + d2.getDay());
        
        d2.setMonth(13);
        System.out.println("New month is: " + d2.getMonth());
        
        d2.setYear(2020);
        System.out.println("New year is: " + d2.getYear());
        System.out.println(d2.toString());
        
        d2.setDate(30, 2, 2030);
        System.out.println(d2.toString());
        
        
        
        
        
    }
}
