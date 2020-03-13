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
public class TestSoccerPlayer {
    public static void main(String[] args) {
        SoccerPlayer player1 = new SoccerPlayer("John", 35, "Middle", "Top");
        
        player1.run();
        player1.jump();
        player1.kickBall();
        
    }
}
