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

//<editor-fold defaultstate="collapsed" desc="Methods">
    public void draw(Graphics graphics) {
        //write the code to draw a kirby!!!
        graphics.setColor(Color.BLUE);
        graphics.fillOval(position.x, position.y, 3, 3);
        graphics.fillOval(position.x, position.y + height, 3, 3);
        graphics.fillOval(position.x + width, position.y, 3, 3);
        graphics.fillOval(position.x + width, position.y + height, 3, 3);
        
        graphics.setColor(Color.PINK);
        graphics.fillOval(position.x + (width * 1 / 8), position.y, width * 3 / 4, height * 3 / 4);
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
