/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paintswing.figure;

import java.awt.Color;
import java.awt.Graphics2D;

import paintswing.Point;

/**
*
* @author drako597
* @version 1.0
* 
*/
public class Circle extends AbstractFigure {

    public Circle(Point point) {
        super(point);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(color);
        g.drawOval(x, y, width, height);
    }
}