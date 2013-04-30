/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paintswing.figure;

import java.awt.Color;
import java.awt.Graphics;

import paintswing.Point;

/**
*
* @author drako597
* @version 1.0
* 
*/
public abstract class AbstractFigure implements Figure {

	protected int width;
	protected int height;
	protected int x;
	protected int y;
	protected Color color;

    public AbstractFigure(Point point) {
        this.width = point.getX();
        this.height = point.getY();
        this.color = point.getColor();
        this.x = point.getX2();
        this.y = point.getY2();
    }

    public String toString() {
        return "[color=" + color + ", width=" + width + ", height=" + height
                + "]";
    }
}