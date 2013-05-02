/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package paintswing;

import javax.swing.SwingUtilities;

/**
*
* @author drako597
* @version 1.0
* 
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
                 new Paint();


            }
        });
    }
}