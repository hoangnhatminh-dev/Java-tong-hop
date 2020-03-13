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
public class MyCircle {
    private MyPoint center;
    private int radius;
    
    public MyCircle(){
        center = new MyPoint (0,0);
        radius = 1;
    }
    
    public MyCircle(int x, int y, int radius){
        center = new MyPoint(x,y);
        this.radius = radius;
    }
    
    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }
    
    public int getRadius(){
        return this.radius;
    }
    
    public void setRadius(int radius){
        this.radius = radius;
    }
    
    public MyPoint getCenter(){
        return this.center;
    }
    
    public void setCenter(MyPoint center){
        this.center = center;
    }
    
    public int getCenterX(){
        return center.getX();
    }
    
    public void setCenterX(int x){
        this.center.setX(x);
    }
    
    public int getCenterY(){
        return center.getY();
    }
    
    public void setCenterY(int y){
        this.center.setY(y);
    }
    
    public int[] getCenterXY(){
        int[] results = new int[2];
        results[0] = center.getX();
        results[1] = center.getY();
        return results;
    }
    
    public void setCenterXY(int x, int y){
        this.center.setX(x);
        this.center.setY(y);
    }
    
    @Override
    public String toString(){
        return "MyCircle[radius = " + this.radius + ","
                + " center = (" + this.center.getX() + "," + this.center.getY() + ")]";
    }
    
    public double getArea(){
        return radius*radius*Math.PI;
    }
    
    public double getCirumference(){
        return 2*radius*Math.PI;
    }
    
    public double distance(MyCircle another){
        return center.distance(another.center);
    }
}
    
