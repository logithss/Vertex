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
public class Wall {
    Line line;
    float z;
    float height;
    String texture;
    Boolean isCollider;
    Boolean isVisible;

    public Wall(Line line, float z, float height, String texture, Boolean isCollider, Boolean isVisible) {
        this.line = line;
        this.z = z;
        this.height = height;
        this.texture = texture;
        this.isCollider = isCollider;
        this.isVisible = isVisible;
    }

    public Wall(Line line, float z, float height, String texture) {
        this.line = line;
        this.z = z;
        this.height = height;
        this.texture = texture;
    }
    
    
}
