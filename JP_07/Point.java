/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_07;

/**
 *
 * @author rough
 */
public class Point {
    private int x;
    private int y;
    
    public Point(){
        x = 1;
        y = 1;
    }
    
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public int[] getXY(){
        int[] results = new int[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }
    
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    
    public double distance(Point another){
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    
    public double distance(){
        int xDiff = this.x - 0;
        int yDiff = this.y - 0;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    
    
    @Override
    public String toString(){
        return "Point(x,y) = (" + this.x + "," + this.y + ")" ; 
    }
}
