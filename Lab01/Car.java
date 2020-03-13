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
public class Car {
    private String plateNumber;
    private String xLocation;
    private String yLocation;
    private double speed1;
    private double speed2;
    
    public Car (){
        System.out.println("Demo for Car class");
    }
    
    public Car(String plateNumber, String xLocation, 
            String yLocation, double speed1, double speed2){
        this.plateNumber = plateNumber;
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        this.speed1 = speed1;
        this.speed2 = speed2;
    }
    
    public void move(){
        System.out.println("The car with plate " + plateNumber 
                + " move from " + xLocation + " to " + yLocation
                + " at the speed " + speed1);
    }
    
    public void park(){
                System.out.println("The car with plate " + plateNumber 
                + " move from " + xLocation + " and parking at " + yLocation);
    }
    
    public void accelerate(){
                System.out.println("The car with plate " + plateNumber 
                + " accelerate from " + speed1 + " to " + speed2);
                }
}
