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
public class Battery {
    private int energy;
    
    public Battery(){
        energy = 100;
    }
    
    public void setEnergy(int energy){
        this.energy = energy;
    }
    
    public int getEnergy(){
        return energy;
    }
    
    public void decreaseEnergy(){
        energy--;
    } 

    @Override
    public String toString() {
        return "Battery{" + "energy=" + energy + '}';
    }
    
    

    
   
}

