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
public class MovablePoint implements Movable {
    private int x;
    private int y;
    
    public MovablePoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString(){
        return "Move to: (" + this.x + "," + this.y + ")";
    }
    
    @Override
    public void moveUp(){
        x++;
    }
    
    @Override
    public void moveDown(){
        x--;
    }
    
    @Override
    public void moveLeft(){
        y--;
    }
    
    @Override
    public void moveRight(){
        y++;
    }
}
