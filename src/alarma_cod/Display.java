package alarma_cod;

import java.util.Date;

/**
 *Esta clase es la visualizacion del programa
 * @author mbacelofernandez
 */
public class Display {
    /**
     * Muestra siempre la hora actualizada del sistema
     */
    public static void visualizarHora() {
        Date fecha = new Date();

        System.out.println(fecha.getHours() + ":" + fecha.getMinutes() + ":" + fecha.getSeconds());

    }
    /**
     * menu de la botonera
     */
    public static void opciones(){
        
        System.out.println("--------ALARMA--------\n"+
                            "1)Visualizar reloj\n"+
                            "2)Crear alarma\n"+
                            "3)Activar/Desactivar alarma\n"+
                            "4)Salir");  
        
    }

}
