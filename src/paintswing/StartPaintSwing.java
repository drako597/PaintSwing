/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package paintswing;

import javax.swing.SwingUtilities;

/**
 * Klasa main
 * @author Karol Gajda
 */
public class StartPaintSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                Paint paint = new Paint();


            }
        });
    }
}