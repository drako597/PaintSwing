/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paintswing;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import paintswing.figure.*;

/**
*
* @author drako597
* @version 1.0
* 
*/
class Area extends JPanel implements Observer, Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -7541442990117025210L;
	private final Collection<Figure> figle = new ArrayList<>();
    private Settings settings;
    public Area(Settings settings) {
    	settings.addObserver(this);
    	this.settings=settings;
    	
        setSize(settings.getWightAera(), settings.getHeightAera());
        setBackground(settings.getBackgraundCollor());

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


	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		setBackground(settings.getBackgraundCollor());
		this.repaint();
		
	}

	public Collection<Figure> getCollectionFigure() {
		// TODO Auto-generated method stub
		return figle;
	}
	

}
