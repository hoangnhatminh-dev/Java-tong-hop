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
public class Point2Line{
    private Point begin;
    private Point end;
    
    public Point2Line(Point begin, Point end){
        this.begin = begin;
        this.end = end;
    }
    
    public Point2Line(int beginX, int beginY, int endX, int endY){
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }
}
