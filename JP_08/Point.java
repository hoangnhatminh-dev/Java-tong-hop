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
public class Point {
    private float x;
    private float y;
    
    public Point(){
        x = 0.0f;
        y = 0.0f;
    }
    
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    
    public float getX(){
        return this.x;
    }
    
    public void setX(float x){
        this.x = x;
    }
    
    public float getY(){
        return this.y;
    }
    
    public void setY(float y){
        this.y = y;
    }
    
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    
    public float[] getXY(){
        float[] results = new float[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }
    
    @Override
    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }
    
}
