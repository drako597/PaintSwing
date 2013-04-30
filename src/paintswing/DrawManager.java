/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paintswing;

import java.awt.Color;
import paintswing.figure.Circle;
import paintswing.figure.EnumFigure;
import paintswing.figure.Figure;
import paintswing.figure.Line;
import paintswing.figure.Rectangle;

/**
*
* @author drako597
* @version 1.0
* 
*/
class DrawManager {

	protected Area area;
	protected String figle = "LINE";
	protected Color color;
	

    public DrawManager(Area area) {
        this.area = area;
    }

    public void draw(Point point) {
      /*  switch (figle) {
            case "Line":
                area.figle.add(new Line(x, y, x2, y2, color));
                break;
            case "Circle":
                area.figle.add(new Circle(x, y, x2, y2, color));
                break;
            case "Rectangle":
                area.figle.add(new Rectangle(x, y, x2, y2, color));
            default:
                // area.figle.add(new Line(x, y, x2, y2, color));
                break;
        }*/
    	point.setColor(color);
    	area.figle.add(EnumFigure.valueOf(figle).create(point));
        area.repaint();
    }

    public void setStringFigle(String figle) {
        this.figle = figle;
    }

    void setStringColor(Color color) {
        this.color = color;
    }

    void clear() {
        area.clear();
    }
}