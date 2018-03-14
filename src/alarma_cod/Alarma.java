
package alarma_cod;

import javax.swing.JOptionPane;

/**
 *
 * @author mbacelofernandez
 */
public class Alarma {
    
     int hAlarma;
     int mAlarma;
    
    public void crearAlarma() {

        hAlarma = Integer.parseInt(JOptionPane.showInputDialog("Introduce hora de la alarma"));
        mAlarma = Integer.parseInt(JOptionPane.showInputDialog("Introduce minutos de la alarma"));
        
        System.out.println("Alarma creada: " + hAlarma + ":" + mAlarma);

    }

    
}
