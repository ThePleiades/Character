/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author david
 */
public class Kirby {
    private final Color DEEP_PINK = new Color(210, 0, 84);
    private final Color DEEPER_PINK = new Color(255, 50, 50);
//<editor-fold defaultstate="collapsed" desc="Methods">
    public void draw(Graphics graphics) {
        //write the code to draw a kirby!!!
        
        graphics.setColor(Color.BLUE);//corners
        graphics.fillOval(position.x, position.y, 3, 3);
        graphics.fillOval(position.x, position.y + height, 3, 3);
        graphics.fillOval(position.x + width, position.y, 3, 3);
        graphics.fillOval(position.x + width, position.y + height, 3, 3);
        
        graphics.setColor(Color.BLACK);//foot behind BODY
        graphics.fillOval(position.x + (width * 5 / 12), position.y + (height * 22 / 64), width * 21 / 64, height * 32 / 64);
        graphics.setColor(DEEP_PINK);
        graphics.fillOval(position.x + (width * 54 / 128), position.y + (height * 22 / 64), width * 20 / 64, height * 31 / 64);
        
        graphics.setColor(Color.BLACK);//Hand in front of BODY
        graphics.fillArc(position.x + (width * 35 / 64), position.y + (height * 12 / 64), width * 1 / 2, height * 1 / 4, 90, -180);
        graphics.setColor(Color.PINK);
        graphics.fillArc(position.x + (width * 34 / 64), position.y + (height * 14 / 64), width * 1 / 2, height * 1 / 5, 90, -180);
        
        //BODY
        graphics.setColor(Color.BLACK);
        graphics.fillOval(position.x + (width * 1 / 8), position.y, width * 75 / 100, height * 75 / 100);
        graphics.setColor(Color.PINK);
        graphics.fillOval(position.x + (width * 3 / 20), position.y + (height * 1 / 30), width * 70 / 100, height * 70 / 100);
        
        graphics.setColor(Color.BLACK);//Foot infront of BODY
        graphics.drawOval(position.x + (width * 20 / 64), position.y + (height * 30 / 64), width * 1 / 4 , height * 9 / 24);
        graphics.setColor(DEEP_PINK);
        graphics.fillOval(position.x + (width * 20 / 64), position.y + (height * 30 / 64), width * 1 / 4, height * 9 / 24);
        
        graphics.setColor(Color.BLACK);//Hand in front of BODY
        graphics.fillArc(position.x + (width * 1 / 64), position.y + (height * 1 / 4), width * 1 / 2, height * 1 / 4, 90, 180);
        graphics.setColor(Color.PINK);
        graphics.fillArc(position.x + (width * 1 / 32), position.y + (height * 9 / 32), width * 1 / 2, height * 1 / 5, 90, 180);
        
        
        
        //Mouth
        graphics.setColor(Color.BLACK);
        graphics.fillArc(position.x + (width * 14 / 24), position.y + (height * 9 / 32), width * 1 / 8, height * 2 / 12, 180, 180);
        graphics.setColor(DEEPER_PINK);//Insinde of mouth
        graphics.fillArc(position.x + (width * 77 / 128), position.y + (height * 43 / 128), width * 3 / 32, height * 6 / 64, 180, 180);
        
        //Eyes
        graphics.setColor(Color.BLACK);
        graphics.fillOval(position.x + (width * 1 / 2), position.y + (height * 20 / 128), width * 11 / 128, height * 25 / 128);
        graphics.setColor(Color.BLACK);
        graphics.fillOval(position.x + (width * 90 / 128), position.y + (height * 21 / 128), width * 10 / 128, height * 24 / 128);
        
        
        
    }
    
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Properties">
    private int height = 200;
    private int width = 200;
    private Point position;
    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the position
     */
    public Point getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Point position) {
        this.position = position;
    }
//</editor-fold>

}
