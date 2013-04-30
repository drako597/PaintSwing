/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paintswing.figure;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author drako597
 */
public class Circle extends AbstractFigure {

    public Circle(int x, int y, int x2, int y2, Color color) {
        super(x, y, x2, y2, color);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(color);
        g.drawOval(x, y, width, height);
    }
}