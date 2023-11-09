/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.*;
import java.awt.*;

public class CustomDialog extends JDialog {
    private JLabel label1;
    private JLabel label2;

    public CustomDialog(String message1, String message2) {
        label1 = new JLabel(message1);
        label2 = new JLabel(message2);

        // Set up the layout
        setLayout(new FlowLayout());

        // Add the labels to the dialog
        add(label1);
        add(label2);

        // Set dialog properties
        setTitle("Custom Dialog");
        setSize(300, 100);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Center the dialog on the screen
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            String message1 = "Hello,";
            String message2 = "World!";
            CustomDialog dialog = new CustomDialog(message1, message2);
            dialog.setVisible(true);
        });
    }
}