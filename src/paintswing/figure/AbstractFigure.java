/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paintswing.figure;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author drako597
 */
public abstract class AbstractFigure implements Figure {

    protected int width;
    protected int height;
    protected int x;
    protected int y;
    protected Color color;

    public AbstractFigure(int width, int height, int x, int y, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[color=" + color + ", width=" + width + ", height=" + height
                + "]";
    }
}