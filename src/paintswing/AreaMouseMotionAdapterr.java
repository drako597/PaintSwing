package paintswing;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JLabel;

public class AreaMouseMotionAdapterr extends MouseMotionAdapter {
	JLabel point;
	
	public AreaMouseMotionAdapterr(DrawManager drawManager,JLabel point) {
		this.point=point;
	}
		public void mouseMoved(MouseEvent e) {
            int x = e.getX();
           int  y = e.getY();
            point.setText("X:" + x + "Y:" + y);
            
            super.mouseMoved(e);
        }
		
}
