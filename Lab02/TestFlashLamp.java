/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab02;

/**
 *
 * @author rough
 */
public class TestFlashLamp {
    public static void main(String[] args) {
        Battery battery1 = new Battery();
        
        
        battery1.setEnergy(200);
        System.out.println("The battery is: " + battery1.getEnergy());
        System.out.println(battery1.toString());
        
        FlashLamp lamp1 = new FlashLamp();
        
        lamp1.setBattery(battery1);
        System.out.println("lamp1 " + lamp1.getBatteryinfo());
        
        int i = 0;
        while (i < 10){
            lamp1.turnON();
            lamp1.turnOFF();
            i++;
            System.out.println(lamp1.toString());
        }
         
    }

}
