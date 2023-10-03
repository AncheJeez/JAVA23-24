/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AplicacionSwing {
    private static String labelPrefix =
                      "Número de pulsaciones en el botón: ";
    private int numClicks = 0;

    public Component createComponents() {
        final JLabel label = new JLabel(labelPrefix + "0    ");

        JButton button = new JButton("Soy un botón Swing!");
        button.setMnemonic(KeyEvent.VK_I);  // Asignarle una tecla.
        button.addActionListener(new ActionListener() {  // Evento de boton.
            public void actionPerformed(ActionEvent e) {
                numClicks++;
                label.setText(labelPrefix + numClicks);
            }
        });
        label.setLabelFor(button);  // Para minusválidos.

        /*
         * Un modo fácil de colocar espacio entre un
         * contenedor de alto nivel y su contenido es
	 * poner sus contenidos dentro de un JPanel
         * que posee un borde "vacío".
         */
        JPanel pane = new JPanel();
        pane.setBorder(BorderFactory.createEmptyBorder(
                                        30, //arriba
                                        30, //izquierda
                                        10, //abajo
                                        30) //derecha
                                        );
        pane.setLayout(new GridLayout(0, 1));
        pane.add(button);
        pane.add(label);

        return pane;
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(
                UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) { }

        //Crea el contenedor de más alto nivel y le añade contenido.
        JFrame frame = new JFrame("AplicacionSwing");
	// Llamada la constructor por defecto "AplicacionSwing(){};".
        AplicacionSwing app = new AplicacionSwing();
        Component contents = app.createComponents();
        // Añadirele al Component del JFrame (frame.getContentPane()
        // El Contenedor formado (contens) y el tipo de Layout.
        frame.getContentPane().add(contents, BorderLayout.CENTER);
           // es get: obtengo el Component y añado con add.

        //Termina de ubicar el frame y lo muestra.
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.pack();
        frame.setVisible(true);
    }
}