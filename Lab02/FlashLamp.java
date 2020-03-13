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
public class FlashLamp {
    private boolean status;
    private Battery battery;
    
    public FlashLamp(){
        status = false;
    }
    
    public void setBattery(Battery battery){
        this.battery = battery;
    }
    
    public int getBatteryinfo(){
        return battery.getEnergy();
    }
    
    public void light(){
        if (status == true && battery != null && battery.getEnergy()>0){
            battery.decreaseEnergy();
        }
    }
    
    public void turnON(){
        if(battery != null && battery.getEnergy() > 0){
            this.status = true;
        }
        light();
    }
    
    public void turnOFF(){
            this.status = false;
    }

    @Override
    public String toString() {
        return "FlashLamp{" + "status=" + status + ", battery=" + battery + '}';
    }
    
    
    
    
}
