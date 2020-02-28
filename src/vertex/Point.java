/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vertex;

/**
 *
 * @author cstuser
 */
public class Point {
    float x, y;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    static double getDistance(Point p1, Point p2)
    {
        float a = (float) (Math.pow((p2.y - p1.y),2) + Math.pow((p2.x - p1.x),2));
        return Math.sqrt(a);
    }
    
    public String toString()
    {
        return "x : " + x + " y : " + y;
    }
    
}
