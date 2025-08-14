package Vista;

import Controlador.VuelosController;
import Modelos.Lugar;

import javax.swing.*;
import java.awt.*;

public class VuelosGUI extends JFrame {
    private VuelosController controller;
    
    private JTextField txtPais;
    private JTextField txtCiudad;
    private JTextField txtHotel;
    private JTextField txtPuntos;
    private JTextArea txtResultado;

    public VuelosGUI() {
        controller = new VuelosController();
        setTitle("Gestión de Vuelos y Lugares");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initUI();
    }

    private void initUI() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 5, 5));

        // Campos para crear lugar
        panel.add(new JLabel("País:"));
        txtPais = new JTextField();
        panel.add(txtPais);

        panel.add(new JLabel("Ciudad:"));
        txtCiudad = new JTextField();
        panel.add(txtCiudad);

        JButton btnCrearLugar = new JButton("Crear Lugar");
        btnCrearLugar.addActionListener(e -> {
            String pais = txtPais.getText().trim();
            String ciudad = txtCiudad.getText().trim();
            if (!pais.isEmpty() && !ciudad.isEmpty()) {
                controller.crearLugar(pais, ciudad);
                mostrarInfoLugar();
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese país y ciudad");
            }
        });
        panel.add(btnCrearLugar);

        // Campo para hotel
        panel.add(new JLabel("Hotel:"));
        txtHotel = new JTextField();
        panel.add(txtHotel);

        JButton btnAsignarHotel = new JButton("Asignar Hotel");
        btnAsignarHotel.addActionListener(e -> {
            String hotel = txtHotel.getText().trim();
            if (!hotel.isEmpty()) {
                controller.asignarHotel(hotel);
                mostrarInfoLugar();
            }
        });
        panel.add(btnAsignarHotel);

        // Campo para puntos de interés
        panel.add(new JLabel("Puntos de Interés:"));
        txtPuntos = new JTextField();
        panel.add(txtPuntos);

        JButton btnAsignarPuntos = new JButton("Asignar Puntos");
        btnAsignarPuntos.addActionListener(e -> {
            String puntos = txtPuntos.getText().trim();
            if (!puntos.isEmpty()) {
                controller.asignarPuntosDeInteres(puntos);
                mostrarInfoLugar();
            }
        });
        panel.add(btnAsignarPuntos);

        // Área de resultado
        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        JScrollPane scroll = new JScrollPane(txtResultado);

        // Estructura final
        setLayout(new BorderLayout());
        add(panel, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
    }

    private void mostrarInfoLugar() {
        Lugar lugar = controller.getLugar();
        if (lugar != null) {
            txtResultado.setText(
                "País: " + lugar.getPais() + "\n" +
                "Ciudad: " + lugar.getCiudad() + "\n" +
                "Hotel: " + (lugar.getHotel() != null ? lugar.getHotel() : "No asignado") + "\n" +
                "Puntos de Interés: " + (lugar.getPuntosDeInteres() != null ? lugar.getPuntosDeInteres() : "No asignados")
            );
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VuelosGUI().setVisible(true));
    }
}
