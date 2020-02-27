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
    
    public String toString()
    {
        return "x : " + x + " y : " + y;
    }
    
}
