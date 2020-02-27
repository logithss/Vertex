/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vertex;

/**
 *
 * @author cstuser
 */
public class Wall {
    Point p1, p2;
    float z;
    float height;
    String texture;
    Boolean isCollider;
    Boolean isVisible;

    public Wall(Point p1, Point p2, float z, float height, String texture, Boolean isCollider, Boolean isVisible) {
        this.p1 = p1;
        this.p2 = p2;
        this.z = z;
        this.height = height;
        this.texture = texture;
        this.isCollider = isCollider;
        this.isVisible = isVisible;
    }

    public Wall(Point p1, Point p2, float z, float height, String texture) {
        this.p1 = p1;
        this.p2 = p2;
        this.z = z;
        this.height = height;
        this.texture = texture;
    }
    
    
}
