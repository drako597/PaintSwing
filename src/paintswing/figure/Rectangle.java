/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paintswing.figure;

import java.awt.Graphics2D;

import paintswing.Point;

/**
*
* @author drako597
* @version 1.0
* 
*/
public class Rectangle extends AbstractFigure {

    public Rectangle(Point point) {
        super(point);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(color);
        g.drawRect(x, y, width, height);
    }
}