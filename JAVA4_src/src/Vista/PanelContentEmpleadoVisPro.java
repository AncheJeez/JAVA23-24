/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Programador;
import java.awt.Color;

/**
 *
 * @author andres
 */
public class PanelContentEmpleadoVisPro extends javax.swing.JPanel {

    private JFramePrincipal JFrame;
    /**
     * Creates new form PanelContentEmpleadoVIsPro
     */
    public PanelContentEmpleadoVisPro(JFramePrincipal JFrame) {
        initComponents();
        this.JFrame = JFrame;
        this.setSize(250, 250);
        this.setBackground(new Color(255, 102, 178));
        setBoxesEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fieldSueldoExtra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldLengFav = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("Sueldo Extra");

        fieldSueldoExtra.setText("jTextField1");

        jLabel2.setText("LenguajeProg favorito");

        fieldLengFav.setText("jTextField2");

        jLabel3.setText("Programador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(fieldSueldoExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldLengFav, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldSueldoExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldLengFav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public Programador getDataBoxes(){
        double saldoExtra = 0;
        String lengFav = null;
        try{
            saldoExtra = Double.parseDouble(fieldSueldoExtra.getText());
        }catch(NumberFormatException e){
            System.out.println("El saldoExtra del empleado no es de tipo double.");
        }
        lengFav = (fieldLengFav.getText().isEmpty())? null:fieldLengFav.getText();
        Programador pro = new Programador(saldoExtra,lengFav);
        return pro;
    }
    
    public void fillBoxes(Programador pro){
        if(!JFrame.getListaEmpleados().isEmpty()){
            fieldSueldoExtra.setText(""+pro.getSueldoExtra());
            fieldLengFav.setText(""+pro.getLengProgFav());
        }else{
            emptyBoxes();
        }
    }
    
    public void setBoxesEditable(boolean typeOfEditable){
        fieldLengFav.setEditable(typeOfEditable);
        fieldSueldoExtra.setEditable(typeOfEditable);
    }
    
    public void emptyBoxes(){
        fieldSueldoExtra.setText("");
        fieldLengFav.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldLengFav;
    private javax.swing.JTextField fieldSueldoExtra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}