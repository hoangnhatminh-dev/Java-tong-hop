/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_09;

/**
 *
 * @author rough
 */
public class WaterMonster extends Monster{
    public WaterMonster(String name){
        super(name);
    }
    
    @Override
    public String attack(){
        return "Attack with water!";
    }
}
