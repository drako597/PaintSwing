package paintswing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import paintswing.figure.Figure;

public class CollectionFigure implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2083507788616313816L;
	private final Collection<Figure> figure;
	String mg = "bal bla bla";

	public CollectionFigure() {
		// TODO Auto-generated constructor stub
		figure = new ArrayList<>();
	}

	/**
	 * 
	 * @param f
	 *            new figure
	 */
	public void addFigure(Figure f) {
		figure.add(f);
		System.out.print("1");
	}

	/**
	 * 
	 * @return Collection Figure
	 */
	public Collection<Figure> getCollectionFigure() {
		return figure;
	}

}
