import Vista.PreciosGUI;
import javax.swing.SwingUtilities;

public class Main2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PreciosGUI().setVisible(true);
        });
    }
}
