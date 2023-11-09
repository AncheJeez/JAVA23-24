/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.MyList;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;

/**
 *
 * @author andres
 */
public class PanelBtnGuardarFichero extends javax.swing.JPanel {

    private JFramePrincipal JFrame;
    private MyList listaEmpleadosEnPanel;
    /**
     * Creates new form PanelGuardarFichero
     */
    public PanelBtnGuardarFichero(JFramePrincipal JFrame) {
        initComponents();
        this.JFrame = JFrame;
        this.setSize(600, 200);
        this.setBackground(new Color(255, 162, 55));
        emptyBoxes();
        fieldRutaFile.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fieldNombreFile = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldRutaFile = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnGuardarFichero = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();

        setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Elija nombre del fichero:");

        fieldNombreFile.setText("jTextField1");

        jLabel2.setText("Elija ruta guardar fichero:");

        fieldRutaFile.setText("jTextField2");

        jButton2.setText("Path Chooser");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnGuardarFichero.setText("Guardar Fichero");
        btnGuardarFichero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarFicheroActionPerformed(evt);
            }
        });

        lblError.setForeground(new java.awt.Color(255, 0, 0));
        lblError.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldRutaFile, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                    .addComponent(fieldNombreFile))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblError)
                                    .addComponent(btnGuardarFichero))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fieldNombreFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fieldRutaFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addGap(30, 30, 30)
                .addComponent(btnGuardarFichero)
                .addGap(18, 18, 18)
                .addComponent(lblError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFrame.swapBotonPanelBtnInicio();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("choosertitle");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            //System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
            //System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
            fieldRutaFile.setText(""+chooser.getSelectedFile());
        } else {
          System.out.println("No Selection ");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnGuardarFicheroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarFicheroActionPerformed
        // para saber si el nombre contiene o no caracteres especiales
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(fieldNombreFile.getText());
        boolean b = m.find();
        lblError.setText("");
        if(b || fieldNombreFile.getText().equalsIgnoreCase("")){
            lblError.setForeground(Color.red);
            lblError.setText("ERROR NAME NOT VALID");
        }if(fieldRutaFile.getText().equalsIgnoreCase("")){
            lblError.setForeground(Color.red);
            String aux = lblError.getText();
            lblError.setText(aux+" PATH NOT VALID");
        }
        else{
            lblError.setForeground(Color.black);
            lblError.setText("FILE SAVED IN "+fieldRutaFile.getText());
            JFrame.getListaEmpleados().serialization(fieldNombreFile.getText(), fieldRutaFile.getText());
        }
    }//GEN-LAST:event_btnGuardarFicheroActionPerformed

    
    public void emptyBoxes(){
        fieldNombreFile.setText("");
        fieldRutaFile.setText("");
        lblError.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarFichero;
    private javax.swing.JTextField fieldNombreFile;
    private javax.swing.JTextField fieldRutaFile;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblError;
    // End of variables declaration//GEN-END:variables
}
