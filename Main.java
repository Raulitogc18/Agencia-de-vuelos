import Vista.VuelosGUI;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VuelosGUI().setVisible(true);
        });
    }
}
