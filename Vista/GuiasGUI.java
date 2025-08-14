package Vista;

import Controlador.GuiasController;
import Modelos.Guia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiasGUI extends JFrame {

    private GuiasController controller;
    private JList<String> listaGuias;
    private DefaultListModel<String> modeloLista;

    public GuiasGUI(GuiasController controller) {
        this.controller = controller;

        setTitle("Seleccionar Guía");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Modelo de la lista
        modeloLista = new DefaultListModel<>();
        for (Guia g : controller.getGuias()) {
            modeloLista.addElement(g.getNombre() + " - " + g.getIdiomas() + " - " + g.getExperiencia());
        }

        // Configurar JList
        listaGuias = new JList<>(modeloLista);
        listaGuias.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Solo un guía a la vez
        JScrollPane scrollPane = new JScrollPane(listaGuias);

        // Botón elegir guía
        JButton btnElegir = new JButton("Elegir Guía");
        btnElegir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int indice = listaGuias.getSelectedIndex();
                if (indice != -1) {
                    Guia guiaSeleccionado = controller.getGuias().get(indice);
                    JOptionPane.showMessageDialog(null,
                            "Guía seleccionado:\n" +
                                    "Nombre: " + guiaSeleccionado.getNombre() + "\n" +
                                    "Idioma: " + guiaSeleccionado.getIdiomas() + "\n" +
                                    "Experiencia: " + guiaSeleccionado.getExperiencia());
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, seleccione un guía.");
                }
            }
        });

        // Layout
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(btnElegir, BorderLayout.SOUTH);
    }
}
