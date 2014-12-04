/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import environment.Environment;
import images.ResourceTools;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author david
 */
class CharacterEnvironment extends Environment {
    Kirby myBigKirby, mySmallKirby;
    Image kirbyImage;
    
    @Override
    public void initializeEnvironment() {
        myBigKirby = new Kirby();
        myBigKirby.setHeight(200);
        myBigKirby.setWidth(200);
        myBigKirby.setPosition(new Point(250, 10));
        
        mySmallKirby = new Kirby();
        mySmallKirby.setHeight(100);
        mySmallKirby.setWidth(100);
        mySmallKirby.setPosition(new Point(550, 10));
        
        
        kirbyImage = ResourceTools.loadImageFromResource("resources/kirby.png");
    }

    @Override
    public void timerTaskHandler() {
        
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {

    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {

    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {

    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        graphics.drawImage(kirbyImage, 10, 10, 200, 200, this);
        
        if (myBigKirby != null) {
            myBigKirby.draw(graphics);
        }

        if (mySmallKirby != null) {
            mySmallKirby.draw(graphics);
        }
    }


    
}
