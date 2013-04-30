/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paintswing;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.JPanel;
import paintswing.figure.*;

/**
*
* @author drako597
* @version 1.0
* 
*/
class Area extends JPanel {

    protected final Collection<Figure> figle = new ArrayList<>();
    Image img;

    public Area() {
        super();
        setBackground(Color.WHITE);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        for (Figure f : figle) {
            f.draw(g2d);
        }
    }

    void clear() {
        figle.removeAll(figle);
        this.repaint();
    }
}
