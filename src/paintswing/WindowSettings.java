package paintswing;

import javax.swing.JDialog;
import javax.swing.SpringLayout;

public class WindowSettings extends JDialog {

	
	/**
	 * 
	 */
	
	public WindowSettings() {
		setTitle("Ustawienia");
		setSize(400,500);
		//setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
		setLayout(new SpringLayout());
		
		setVisible(false);
		
		
	}

}
