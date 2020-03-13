/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_04;

/**
 *
 * @author rough
 */
public class Author {
    private String name;
    private String email;
    private char gender;
    
    public Author(){
        name = "Null";
        email = "Null";
        gender = 'n';
    }
    
    public Author (String name, String email, char gender){
        if(gender == 'm' || gender == 'f'){
            this.name = name;
            this.email = email;
            this.gender = gender;
        }else{
            System.out.println("Input incorrect. Please try again");
            this.name = name;
            this.email = email;
            
        }
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public char getGender(){
        return this.gender;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    @Override
    public String toString(){
        return "Author[name = " + this.name + ", email = " + this.email
                + ", gender = " + this.gender;
    }
    
    
    
}
