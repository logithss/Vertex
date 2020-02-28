/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vertex;

import java.awt.Rectangle;
import java.util.Scanner;
import javafx.scene.shape.TriangleMesh;
import javax.swing.JFrame;


/**
 *
 * @author cstuser
 */
public class Main {

    //static World game;
    public static void main(String[] args){
        // TODO code application logic here
        
        /*JFrame window = new JFrame("Vertex Engine");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(480, 360);
        window.setResizable(true);
        //window.setUndecorated(true);
        window.setVisible(true);
        
        RenderPanel panel = new RenderPanel();
        Game.panel = panel;
        window.add(panel);
        window.setVisible(true);*/
        
        Scanner scan = new Scanner(System.in);
        
        float x = 2.0f;
        
        while(true){
            x = scan.nextFloat();   
            Line l1 = new Line(new Point(0, 0), new Point(55.7f, 10));
            Line l2 = new Line(new Point(0, 10), new Point(10, x));
            Point p = l1.isCrossing(l2);
            System.out.println(p);
            
            if(p != null)
                System.out.println(Point.getDistance(p, new Point(0, 0)));
        }
        
        
        /*while(true){
          Game.gameLoop();
          panel.repaint();
        }*/
        
        
    }
    
}


