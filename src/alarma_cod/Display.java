package alarma_cod;

import java.util.Date;

/**
 *
 * @author mbacelofernandez
 */
public class Display {

    public void visualizarHora() {
        Date fecha = new Date();

        System.out.println(fecha.getHours() + ":" + fecha.getMinutes() + ":" + fecha.getSeconds());

    }

}
