
package chewing.gum.simulator;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends Canvas {

public Window(int width, int height, String title, ChewingGumSimulator game){
    JFrame frame = new JFrame(title);
    
    frame.setPreferredSize(new Dimension((int)width,(int)height));
    frame.setMaximumSize(new Dimension((int)1280,(int)720));
    frame.setMinimumSize(new Dimension((int)width,(int)height));
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setLocationRelativeTo(null);
    frame.add(game);
    frame.setVisible(true);
    game.start();}
    
    
    

    
}   
