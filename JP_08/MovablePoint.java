/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_08;

/**
 *
 * @author rough
 */
public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    
    public MovablePoint(){
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }
    
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    public MovablePoint(float xSpeed, float ySpeed){
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    public float getXSpeed(){
        return this.xSpeed;
    }
    
    public void setXSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }
    
    public float getYSpeed(){
        return this.ySpeed;
    }
    
    public void setYSpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }
    
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    public float[] getSpeed(){
        float[] results = new float[2];
        results[0] = this.xSpeed;
        results[1] = this.ySpeed;
        return results;
    }
    
    @Override
    public String toString(){
        return "(" + super.getX() + "," + super.getY() + 
                ", speed = " + "(" + this.xSpeed + "," + this.ySpeed + ")";
    }
}
