package alarma_cod;

import java.awt.Toolkit;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author mbacelofernandez
 */
public class Alarma {

    Timer timer;
    int hAlarma;
    int mAlarma;
    static boolean activado = false;

    public Alarma() {
        timer = new Timer();
    }

    public void crearAlarma() {

        hAlarma = Integer.parseInt(JOptionPane.showInputDialog("Introduce hora de la alarma"));
        mAlarma = Integer.parseInt(JOptionPane.showInputDialog("Introduce minutos de la alarma"));

        System.out.println("Alarma creada: " + hAlarma + ":" + mAlarma);

    }

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
