/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.MyList;
import Modelo.Empleado;
import java.awt.*;
import java.util.List;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author andres
 */
public class PanelBtnInicio extends javax.swing.JPanel {

    
    private JFramePrincipal JFrame;
    private MyList listaEmpleadosEnPanel;
    /**
     * Creates new form PanelBtnInicio
     */
    public PanelBtnInicio(JFramePrincipal JFrame) {
        initComponents();
        this.JFrame = JFrame;
        this.setSize(600, 200);
        this.setBackground(new Color(43, 140, 196));
        modifyLabelListaState();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCargar = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        lblInfoListaState = new javax.swing.JLabel();

        btnCargar.setText("Cargar Fichero");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnVisualizar.setText("Visualizar");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar Fichero");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        lblInfoListaState.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInfoListaState)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVisualizar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargar)
                    .addComponent(btnVisualizar)
                    .addComponent(btnGuardar)
                    .addComponent(btnCrear))
                .addGap(55, 55, 55)
                .addComponent(lblInfoListaState)
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        JFrame.swapBotonPanelVisuMenu(true);
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        JFrame.swapBotonPanelCargarFichero();
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        JFrame.swapBotonPanelGuardarFichero();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        JFrame.swapBotonPanelCrearMenu(false);
    }//GEN-LAST:event_btnCrearActionPerformed

    public void modifyLabelListaState(){
        //String state = (!JFrame.getListaEmpleados().isEmpty())?"Hay empleados cargados":"No hay empleados en la lista";
        String state;
        if(JFrame.getListaEmpleados().isEmpty()){
            state = "No hay empleados en la lista";
            btnGuardar.setEnabled(false);
            btnVisualizar.setEnabled(false);
        }else{
            state = "Hay empleados cargados";
            btnGuardar.setEnabled(true);
            btnVisualizar.setEnabled(true);
        }
        lblInfoListaState.setText(state);
        //JFrame.getListaEmpleados().showMyList();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JLabel lblInfoListaState;
    // End of variables declaration//GEN-END:variables
}
