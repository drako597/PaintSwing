/**
 * 
 */
package paintswing.figure;

import paintswing.Point;

/**
 * @author drako597
 * @version 1.0
 *
 */
public enum EnumFigure {
	
	LINE {public Figure create(Point point) {return new Line(point);}},
	RECTANGLE {public Figure create(Point point) {return new Rectangle(point);}},
	CIRCLE {public Figure create(Point point) {return new Circle(point);}};
	public abstract Figure create(Point point);
}
