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
public class Renderer {
    float fogFallDistance;
    
    static int screenWidth = 480;
    static int screenHeight = 360;
    
    static void render()
    {
        for (int x = 0; x < screenWidth; x++)
		{
			//planeRenders.clear();
			
			float fRayAngle = (Player.angle - Player.fov / 2.0f) + ((float)x / (float)screenWidth) * Player.fov;
			float correctionAngle = fRayAngle - Player.angle;
			float fEyeX = (float) Math.sin(fRayAngle); // Unit vector for ray in player space
			float fEyeY = (float) Math.cos(fRayAngle);
			float ix = 100 * fEyeX;
			float iy = 100 * fEyeY;
                        
                        

			

		}
    }
}
