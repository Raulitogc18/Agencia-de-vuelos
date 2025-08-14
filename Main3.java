import Controlador.GuiasController;
import Modelos.Guia;
import Vista.GuiasGUI;

import javax.swing.SwingUtilities;

public class Main3 {
    public static void main(String[] args) {

        GuiasController controller = new GuiasController();

        // Crear guías predefinidas
        controller.agregarGuia(new Guia("Pedro Pascal", "Español", "10 años"));
        controller.agregarGuia(new Guia("Will Smith", "Inglés", "3 años"));
        controller.agregarGuia(new Guia("Jackie Chan", "Chino", "7 años"));
        controller.agregarGuia(new Guia("Emma Watson", "Francés", "5 años"));
        controller.agregarGuia(new Guia("Chris Hemsworth", "Alemán", "8 años"));
        controller.agregarGuia(new Guia("Scarlett Johansson", "Portugués", "6 años"));

        SwingUtilities.invokeLater(() -> {
            GuiasGUI gui = new GuiasGUI(controller);
            gui.setVisible(true);
        });
    }
}
