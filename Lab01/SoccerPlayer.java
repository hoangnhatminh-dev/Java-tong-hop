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
public class SoccerPlayer {
    private String name;
    private int number;
    private String xLocation;
    private String yLocation;
    
    public SoccerPlayer(){
        System.out.println("Demo for SoccerPlayer class");
    }
    
    public SoccerPlayer(String name, int number, 
            String xLocation, String yLocation){
        this.name = name;
        this.number = number;
        this.xLocation = xLocation;
        this.yLocation = yLocation;
    }
    
    public void run(){
        System.out.println("The player " + name + " number " + number
                + " at " + xLocation + " are running to " + yLocation
              );
    }
    
    public void jump(){
                 System.out.println("The player " + name + " number " + number
                + " jump from " + xLocation + " to " + yLocation
              );       
    }
    
    public void kickBall(){
                   System.out.println("The player " + name + " number " + number
                + " kick the ball from " + xLocation + " to " + yLocation
              );     
    }
       
}
