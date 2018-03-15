package alarma_cod;

import java.awt.Toolkit;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *Esta clase crea la alarma, la enciende,apaga y ejecuta para que suene y se visualice
 * @author mbacelofernandez
 */
public class Alarma {

    Timer timer;
    int hAlarma;
    int mAlarma;
    static boolean activado = false;
    /**
     * Constructor de la clase
     */
    public Alarma() {
        timer = new Timer();
    }
    /**
     * crea la alarma
     */
    public void crearAlarma() {

        hAlarma = Integer.parseInt(JOptionPane.showInputDialog("Introduce hora de la alarma"));
        mAlarma = Integer.parseInt(JOptionPane.showInputDialog("Introduce minutos de la alarma"));

        System.out.println("Alarma creada: " + hAlarma + ":" + mAlarma);

    }
    /**
     * Enciende y apaga la alarma, determina cada cuanto tiempo sonara el TimerTask
     */
    public void activarDesactivar() {
        if (activado == false) {
            activado = true;
            System.out.println("Alarma activada");

            if (activado = true) {
                timer = new Timer();
                timer.schedule(new TicTac(), 0, 1000);
            }
        } else {
            activado = false;
            System.out.println("La alarma está desactivada");
        }
    }
    /**
     * Cuando la alarma programada coincide con la hora del sistema suena un beep y visualiza un Ring
     */
    public class TicTac extends TimerTask {

        @Override
        public void run() {
            Date fecha = new Date();
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            if (hAlarma == fecha.getHours() && mAlarma == fecha.getMinutes() && activado == true) {
                System.out.println("Riiing Riiing");
                toolkit.beep();

            }

        }

    }

}
