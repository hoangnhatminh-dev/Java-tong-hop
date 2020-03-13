/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjavaprogram;

/**
 *
 * @author rough
 */
public class TestPerson {
    public static void main(String[] args) {
        //khoi tao doi tuong
        Demo person = new Demo();
        Demo person2 = new Demo("John",1);
        
        //goi phuong thuc
        person.move();
        person.say();
    }
}
