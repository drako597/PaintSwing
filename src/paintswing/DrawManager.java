/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paintswing;

import java.awt.Color;
import java.util.Collection;

import paintswing.figure.EnumFigure;
import paintswing.figure.Figure;

/**
*
* @author drako597
* @version 1.0
* 
*/
class DrawManager {

	private Area area;
	private String figle = "LINE";
	private Color color;
	private Collection<Figure> collectionFigle;
	

    public DrawManager(Area area) {
       this.area = area;
       collectionFigle= area.getCollectionFigure();
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
    	collectionFigle.add(EnumFigure.valueOf(figle).create(point));
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