/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab01;

/**
 *
 * @author rough
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0,"red");
        System.out.println("The radius is: " + circle.getRadius());
        System.out.println("The color is: " + circle.getColor());
        System.out.println("The area is: " + circle.getArea());
        
        //constructor mac dinh (default) o ben circle.java
        Circle c1 = new Circle();
        String color1 = c1.getColor();
        System.out.println("color 1 " + color1);
        
        //constructor da dc gan thong so
        Circle c2 = new Circle(1.5,"blue");
        String color2 = c2.getColor();
        System.out.println(c2.toString());
        
        //constructor da dc gan thong so va string khong co du lieu (de trong)
        Circle c3 = new Circle(1.5,"");
        String color3 = c3.getColor();
        System.out.println("color 3 " + color3);
        
        //Constructor chi co thong so radius (da dc khai bao) nen khac voi phan khai bao Circle co ca 2 thong so
        Circle c4 = new Circle(2.5);
        double radius2 = c4.getRadius();
        System.out.println("Radius2 " + radius2);
        
        
        //toString() se ghi toan bo nhung thong tin cua doi tuong
        Circle c5 = new Circle("blue");
        String color4 = c5.getColor();
        System.out.println(c5.toString());
     
    }
    
}
