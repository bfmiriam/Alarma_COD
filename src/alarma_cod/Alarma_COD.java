
package alarma_cod;

/**
 *
 * @author mbacelofernandez
 */
public class Alarma_COD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Display d = new Display();
//        d.visualizarHora();
        
        Alarma a = new Alarma();
        a.crearAlarma();
        a.activarDesactivar();
        
    }
    
}
