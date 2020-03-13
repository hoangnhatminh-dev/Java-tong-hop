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
public class TestCar {
    public static void main(String[] args) {
        Car car = new Car ("PXSDAW","NY","CA",25,30);
        
        car.move();
        car.park();
        car.accelerate();
    }
    
}
