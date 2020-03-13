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
public class Demo {
    //dinh nghia cac thuoc tinh
    private String name;
    private int age;
    
    //dinh nghia constructor de tao doi tuong
    
    //ten constructor trung voi ten class
    //khoi tao doi tuong ko co thong so
    public Demo(){
        System.out.println("A new baby was born");
    }
    
    //kieu du lieu
    //khoi tao doi tuong co thong so
    public Demo(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println(" name " + name + " age " + age);
    }
    
    //dinh nghia cac phuong thuc
    //kieu du lieu tra ve
    public void say(){
        System.out.println("I love you");
    }
    
    
    public void move(){
        System.out.println("I'm falling in love");
    }
}
