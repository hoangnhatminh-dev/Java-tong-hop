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
public class C extends B{
    public C(){
        super();
        System.out.println("Constructed an instance of C");
    }
    
    @Override
    public String toString(){
        return "This is C";
    }
}
