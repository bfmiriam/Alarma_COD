package alarma_cod;

import javax.swing.JOptionPane;

/**
 *Creamos la botonera de la alarma
 * @author mbacelofernandez
 */
public class Menu {
    /**
     * Menu del sistema asociado al metodo opciones de la clase display
     */
    public void menu() {

        Alarma a = new Alarma();
        Display.opciones();

        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Que opcion deseas escoger?"));

        while (opcion != 4) {
            switch (opcion) {

                case 1:
                    Display.visualizarHora();
                    break;
                case 2:
                    a.crearAlarma();
                    break;
                case 3:
                    a.activarDesactivar();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta");

            }
            Display.opciones();
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Que opcion deseas escoger?"));

        }

    }
}