package Vista;

import Controlador.PreciosController;
import Modelos.Precios;

import javax.swing.*;
import java.awt.*;

public class PreciosGUI extends JFrame {
    private PreciosController controller;
    private JTextField txtMoneda;
    private JTextField txtVuelo;
    private JTextField txtHotel;
    private JCheckBox chkDescuento;
    private JTextArea txtResultado;

    public PreciosGUI() {
        setTitle("Gestión de Precios");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        initUI();
    }

    private void initUI() {
        JPanel panel = new JPanel(new GridLayout(5, 2, 5, 5));

        // Moneda
        panel.add(new JLabel("Moneda:"));
        txtMoneda = new JTextField();
        panel.add(txtMoneda);

        // Precio vuelo
        panel.add(new JLabel("Precio Vuelo:"));
        txtVuelo = new JTextField();
        panel.add(txtVuelo);

        // Precio hotel
        panel.add(new JLabel("Precio Hotel:"));
        txtHotel = new JTextField();
        panel.add(txtHotel);

        // Descuento
        panel.add(new JLabel("¿Oferta?"));
        chkDescuento = new JCheckBox();
        panel.add(chkDescuento);

        // Botón calcular
        JButton btnCalcular = new JButton("Calcular Total");
        btnCalcular.addActionListener(e -> calcularTotal());
        panel.add(btnCalcular);

        // Resultado
        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        JScrollPane scroll = new JScrollPane(txtResultado);

        setLayout(new BorderLayout());
        add(panel, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
    }

    private void calcularTotal() {
        try {
            String moneda = txtMoneda.getText().trim();
            double precioVuelo = Double.parseDouble(txtVuelo.getText().trim());
            double precioHotel = Double.parseDouble(txtHotel.getText().trim());
            boolean esOferta = chkDescuento.isSelected();

            controller = new PreciosController(moneda);
            controller.asignarPrecioVuelo(precioVuelo);
            controller.asignarPrecioHotel(precioHotel);
            controller.aplicarDescuento(esOferta);

            Precios precios = controller.getPrecios();
            txtResultado.setText(
                "Moneda: " + precios.getMoneda() + "\n" +
                "Precio Vuelo: " + precios.getPrecioVuelo() + "\n" +
                "Precio Hotel: " + precios.getPrecioHotel() + "\n" +
                "Descuento aplicado: " + (esOferta ? "Sí" : "No") + "\n" +
                "Total: " + precios.getPrecioTotal()
            );
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese precios válidos.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PreciosGUI().setVisible(true));
    }
}
