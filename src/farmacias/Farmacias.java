/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacias;


import Interfaces.Principal;
import MezclaEquilibrada.MezclaEquilibrada;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author PadawanSistemas
 */
public class Farmacias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
       try {
            Principal.setDefaultLookAndFeelDecorated(true);
            SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.BusinessBlueSteelSkin");
            SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceAquaTheme");
            //SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceBinaryWatermark");
            SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceBubblesWatermark");
            
            Principal f1 = new Principal();
            f1.setTitle("Inventario Farmacia");
            f1.setLocationRelativeTo(null);
            f1.setVisible(true);
        } catch (NullPointerException ex) {
        }
         
    }
}
