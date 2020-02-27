/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vertex;

import java.awt.Rectangle;
import javafx.scene.shape.TriangleMesh;
import javax.swing.JFrame;

/**
 *
 * @author cstuser
 */
public class Main {

    //static World game;
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        JFrame window = new JFrame("Vertex Engine");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(480, 360);
        window.setResizable(true);
        window.setUndecorated(false);
        window.setVisible(true);
        //game = new World();
       /* window.add(game);
        
        
        while(true){
            Thread.sleep(game.speed);
            if(!game.gameOver)
                game.drawSnake();
            game.repaint();
            //System.out.println("DONE");
        }*/
    }
    
}


