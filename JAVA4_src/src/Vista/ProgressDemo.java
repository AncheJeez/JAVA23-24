/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.*;
import java.awt.*;

public class ProgressDemo extends JFrame {
    JProgressBar progressBar;
    JLabel progressLabel;

    public ProgressDemo() {
        setTitle("Progress Demo");
        this.setSize(300, 100);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        progressBar = new JProgressBar(0, 1000);
        progressBar.setStringPainted(true);
        progressLabel = new JLabel("Progress: 0%");

        setLayout(new FlowLayout());
        add(progressBar);
        add(progressLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ProgressDemo demo = new ProgressDemo();
            demo.setVisible(true);
        });
    }
}