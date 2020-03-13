/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_10;

/**
 *
 * @author rough
 */
abstract public class Monster {
    private String name;
    
    public Monster(String name){
        this.name = name;
    }
    
    abstract public String attack();
}
