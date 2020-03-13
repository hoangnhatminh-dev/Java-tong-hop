/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_11;

/**
 *
 * @author rough
 */
public class MovablePoint implements Movable {
    int x,y,xSpeed,ySpeed;
    
    public MovablePoint(int x, int y , int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public int getXSpeed(){
        return this.xSpeed;
    }
    
    public int getYSpeed(){
        return this.ySpeed;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public void setXSpeed(int xSpeed){
        this.xSpeed = xSpeed;
    }
    
    public void setYSpeed(int y){
        this.ySpeed = ySpeed;
    }
    
    @Override
    public String toString(){
        return "Move to point: (X = " + this.x + " at speed " + this.xSpeed 
                + ", Y = " + this.y + " at speed " + this.ySpeed;
    }
    
    @Override
    public void moveUp(){
        x += xSpeed;
    }
    
    @Override
    public void moveDown(){
        x -= xSpeed;
    }
    
    @Override
    public void moveLeft(){
        y -= ySpeed;
    }
    
    @Override
    public void moveRight(){
        y += ySpeed;
    }
    
    
}
