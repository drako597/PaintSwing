/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paintswing;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author drako597
 */
public class AreaMouseListner extends MouseAdapter {

    protected DrawManager drawManager;
    protected int x;
    protected int y;
    protected int x2;
    protected int y2;

    public AreaMouseListner(DrawManager drawManager) {
        this.drawManager = drawManager;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        drawManager.draw(new Point(x, y, x2, y2));


    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getX2() {
        return x2;
    }

    public int gety2() {
        return y2;
    }
}