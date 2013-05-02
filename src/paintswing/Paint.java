/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paintswing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 * @author drako597
 * @version 1.0
 * 
 */
class Paint extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7869660082694152151L;
	private Settings settings = new Settings();
	private Area area = new Area(settings);
	private final DrawManager drawManager = new DrawManager(area);
	private final Menu menuBar = new Menu(drawManager, this,settings,area);
	private int x = 0, y = 0;

	public Paint() {
		super("Paint Swng");
		setSize(new Dimension(settings.getWightAera(), settings.getHeightAera()));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		setLayout(new BorderLayout());

		final JLabel point = new JLabel();
		area.addMouseMotionListener(new MouseMotionAdapter() {

			@Override
			public void mouseMoved(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				point.setText("X:" + x + "Y:" + y);

			}
		});
		add(point, BorderLayout.SOUTH);
		add(menuBar.getMenuBar(), BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);
		area.addMouseListener(new AreaMouseListner(drawManager));
		area.addMouseMotionListener(new AreaMouseMotionAdapterr(drawManager,
				point));
		setVisible(true);
		//pack();

	}
}