/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_05;

/**
 *
 * @author rough
 */
public class Author {
    private String name;
    private String email;
    private char gender;
    
    public Author(String name, String email, char gender){
        if(gender == 'm' || gender == 'f'){
            this.name = name;
            this.email = email;
            this.gender = gender;
        }else{
            System.out.println("Input incorrect. Check again");
        }
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public char getGender(){
        return this.gender;
    }
    
    @Override
    public String toString(){
        return name + " (" + gender + "} at " + email;
    }
    
}
