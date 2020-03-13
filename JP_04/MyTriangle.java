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
public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    
    public MyTriangle(int x1, int x2, int x3, int y1, int y2, int y3){
        v1 = new MyPoint(x1,y1);
        v2 = new MyPoint(x2,y2);
        v3 = new MyPoint(x3,y3);
        
    }
    
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    
    @Override
    public String toString(){
        return "MyTriangle[v1 = " + v1.getX() + "," + v1.getY() 
                + ", v2 = " + v2.getX() + "," + v2.getY()
                + ", v3 = " + v3.getX() + "," + v3.getY() + "]";
    }
    
    public double getPerimeter(){
        return v1.distance() + v2.distance() + v3.distance();
    }
    
    public String getType(){
        if ( v1.distance() == v2.distance() && v1.distance() == v3.distance() && v2.distance() == v3.distance()){
            return "Equilateral";
        }else if(v1.distance() != v2.distance() && v1.distance() != v3.distance() && v2.distance() != v3.distance()){
            return "Scalane";
        }else{
            return "Isosceles";
        }
    }
}

