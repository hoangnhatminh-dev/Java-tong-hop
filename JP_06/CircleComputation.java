/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_06;
import java.util.Scanner;
/**
 *
 * @author rough
 */
public class CircleComputation {
    public static void main(String[] args) {
        double radius, diameter, circumference, area;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the radius: ");
        radius = in.nextDouble();
        
        diameter = 2.0 * radius;
        area = Math.PI * radius * radius;
        circumference = 2.0 * Math.PI * radius;
        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Diameter is: %.2f%n", area);
        System.out.printf("Diameter is: %.2f%n", circumference);
        
        
        
        
    }
}
