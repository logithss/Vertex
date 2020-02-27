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
			renders.clear();
			//planeRenders.clear();
			
			float fRayAngle = (Player.angle - Player.fov / 2.0f) + ((float)x / (float)screenWidth) * Player.fov;
			float correctionAngle = fRayAngle - Player.angle;
			float fEyeX = (float) Math.sin(fRayAngle); // Unit vector for ray in player space
			float fEyeY = (float) Math.cos(fRayAngle);
			float ix = 100 * fEyeX;
			float iy = 100 * fEyeY;

			for (RenderCall r : renders)
			{
				if (r.type == 0)
				{

					if (r.distance <= fallDistance)
					{
						//std::cout << r.distance << "\n";
						float tU;
						float yStep;
						int count = 0;
						if (rTexture)
						{


							tU = (r.tU*(1 / r.xStreach) - floor(r.tU*(1 / r.xStreach))) * texture->width;

							float ySize = r.nFloor - r.nCeiling;//number of pixels of the wall
							float tY = ySize / (1 / r.yStreach);//number of pixels for one tile
							yStep = (texture->height / ySize) * (1 / r.yStreach);
							//see if any walls are on top of the screen
							if (r.nCeiling < screenY / 2)
							{
								float invisiblePixels = screenY - r.nCeiling;
								if (invisiblePixels < 0)
								{
									invisiblePixels *= -1;
								}

								float answer = invisiblePixels - (floor(invisiblePixels / tY) * tY);
								count = (answer);
								//std::cout << r.nCeiling << "\n";
								r.nCeiling = 0;
							}

							if (r.nFloor > sHeight)
							{
								r.nFloor = sHeight;
							}
						}

						float n = 1 - r.distance / fallDistance;
						if (r.distance > fallDistance)
						{
							n = 0;
						}
						for (int y = r.nCeiling; y < r.nFloor; y++)
						{
							olc::Pixel c;
							float tV = count * yStep;
							if (tV >= texture->height)
							{
								count = 0;
								float uY = count * yStep;
								//std::cout << "resize ";
							}

							if (rTexture)
							{
								c = texture->GetPixel(tU, tV);


								c = olc::Pixel(c.r * n, c.g * n, c.b * n);
							}
							else
							{
								c = olc::Pixel(0, 0, 255);
							}
							if (c == olc::BLANK)
							{
								//std::cout << "BLANK ";
							}
							else
							{
								Draw(screenX + x, screenY + y, c);
							}
							count++;
						}
						stdr++;
					}

				}
				else if (r.type == 1)
				{


					if (r.bottomY > ScreenHeight())
					{
						r.bottomY = ScreenHeight();
					}

					if (r.bottomY > screenY + sHeight)
					{
						r.bottomY = screenX + sHeight;
					}

					for (int y = r.topY; y < r.bottomY; y++)
					{
						Draw(screenX + x, screenY + y, r.p);
					}
				}

			}

		}
    }
}
