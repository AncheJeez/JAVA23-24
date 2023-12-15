/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.MyList;
import Modelo.Empleado;
import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author andres
 */
public class PanelContentListado extends javax.swing.JPanel {

    private JFramePrincipal JFrame;
    private MyList listadoEmpleadosAux = new MyList();
    private ListModel lModel;
    int selectedItem;
    /**
     * Creates new form PanelContentListado
     */
    public PanelContentListado(JFramePrincipal JFrame) {
        initComponents();
        this.JFrame = JFrame;
        this.setSize(600, 350);
        this.setBackground(new Color(116, 245, 189));
        
        setUpLista(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JLista = new javax.swing.JList<>();
        lblItems = new javax.swing.JLabel();

        JLista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        JLista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                JListaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(JLista);

        lblItems.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblItems)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblItems)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JListaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_JListaValueChanged
        selectedItem = JLista.getSelectedIndex();
        JFrame.empleadoFromListHasBeenChosen();
        //System.out.println("Ha seleccionado: "+JLista.getSelectedValue());
    }//GEN-LAST:event_JListaValueChanged

    
    public void setUpLista(boolean movePanel){
        //jScrollPane1 = new javax.swing.JScrollPane();
        JLista.setModel(modeloLista(movePanel));
        lModel = JLista.getModel();
        //jScrollPane1.setViewportView(JLista);
    }
    
    public Empleado returnEmpleadoChosen(){
        Empleado emp = (Empleado) listadoEmpleadosAux.getNode(selectedItem).getMain();
        return emp;
    }
    
    private DefaultListModel modeloLista(boolean movePanel){
        
        DefaultListModel<String> modelo = new DefaultListModel<>();
        
        JFrame.getListaEmpleados().getFirst();
        int cont = 0;
        if(!JFrame.getListaEmpleados().isEmpty()){
            while(cont < 100){// si se quiere todos utilizar while(true)
                if(JFrame.getListaEmpleados().getCurrentNode().getMain() instanceof Empleado){
                    // guardamos el empleado en una lista auxiliar
                    listadoEmpleadosAux.add((Empleado) JFrame.getListaEmpleados().getCurrentNode().getMain());
                    listadoEmpleadosAux.getPointerLast().setIndice(cont);
                    modelo.addElement("" + JFrame.getListaEmpleados().getCurrentNode().getMain()); 
                }else
                    modelo.addElement("No hay elementos empleado");
                cont++;
                if(!JFrame.getListaEmpleados().getCurrentNode().isLast()){
                    JFrame.getListaEmpleados().getNext();
                }else{
                    break;
                }
            }
            // esto resetea la posicion del current al primero, por si vamos a visualizar 1por1 no esta en la ultima posicion
            JFrame.updatePanelContentEmpleadoVisBoxesFL(true, movePanel);
        }
        lblItems.setText("Elementos mostrados: "+cont);
        return modelo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JLista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblItems;
    // End of variables declaration//GEN-END:variables
}