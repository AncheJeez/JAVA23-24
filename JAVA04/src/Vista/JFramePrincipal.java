/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.MyList;
import Modelo.Analista;
import Modelo.Empleado;
import Modelo.Programador;
import static Vista.mainTerminal.getRandomLogicalDate;
import static Vista.mainTerminal.setDate;
import java.awt.*;
import java.util.GregorianCalendar;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author andres
 */
public class JFramePrincipal extends javax.swing.JFrame {

    private MyList listaEmpleados = new MyList();
    // este es para cuando seleccionamos UN empleado de el JList
    private Empleado empleadoSeleccionado = null;
    
    private PanelBtnInicio PanBtnInicio;
    private PanelContentInicio PanContInicio;
    private PanelBtnVisualizarAsk PanBtnVisAsk;
    private PanelContentEmpleadoVis PanContEmpVis;
    private PanelContentEmpleadoVisPro PanContEmpVisPro;
    private PanelContentEmpleadoVisAna PanContEmpVisAna;
    private PanelBtnEmpleadoVis PanBtnEmpVis;
    private PanelBtnGuardarFichero PanBtnGuaFic;
    private PanelBtnListado PanBtnList;
    private PanelContentListado PanContList;
    /**
     * Creates new form JFramePrincipal
     */
    public JFramePrincipal() {
        initComponents();
        this.setSize(600,600);
        this.setResizable(false);
        PanelContent.setSize(600,400);
        PanelBotones.setSize(600,200);
        
        
        // estos empleados estan aqui en modo de prueba
        GregorianCalendar gc = new GregorianCalendar();
        
        GregorianCalendar gcr1 = getRandomLogicalDate();
        Programador pro1 = new Programador(1,"Andres","Sanchez",2100,6000, gc,30,"Java");
        Programador pro2 = new Programador(2, "Angel", "Gonzalez",1350, 8000, setDate(gc.get(GregorianCalendar.DAY_OF_MONTH),gc.get(GregorianCalendar.MONTH),(gc.get(GregorianCalendar.YEAR)-1)),25,"C#");
        Programador pro3 = new Programador(3,"Sandra","Naranjo",1500,4500, gcr1,60,"Python");
        Programador pro4 = new Programador(4,"Ale","Benitez",2000,2100,setDate(gc.get(GregorianCalendar.DAY_OF_MONTH),gc.get(GregorianCalendar.MONTH),(gc.get(GregorianCalendar.YEAR)-1)),250,"Rust");
        
        GregorianCalendar gcr2 = getRandomLogicalDate();
        Analista an1 = new Analista(5,"Pepe","Lopez",2100,6000, gc,2,8);
        Analista an2 = new Analista(6, "Maria", "Vazquez",1350, 8000, setDate(gc.get(GregorianCalendar.DAY_OF_MONTH),gc.get(GregorianCalendar.MONTH),(gc.get(GregorianCalendar.YEAR)-1)),5,22);
        Analista an3 = new Analista(7,"Francisco","Gomez",1500,4500, gcr2,8,3);
        Analista an4 = new Analista(8,"Lola","Fernandez",2000,2100,setDate(gc.get(GregorianCalendar.DAY_OF_MONTH),gc.get(GregorianCalendar.MONTH),(gc.get(GregorianCalendar.YEAR)-1)),30,4);
        
        
        
        listaEmpleados.add(pro1);
        listaEmpleados.getPointerLast().setIndice(0);
        listaEmpleados.add(pro2);
        listaEmpleados.getPointerLast().setIndice(1);
        listaEmpleados.add(pro3);
        listaEmpleados.getPointerLast().setIndice(2);
        listaEmpleados.add(pro4);
        listaEmpleados.getPointerLast().setIndice(3);
        listaEmpleados.add(an1);
        listaEmpleados.getPointerLast().setIndice(4);
        listaEmpleados.add(an2);
        listaEmpleados.getPointerLast().setIndice(5);
        listaEmpleados.add(an3);
        listaEmpleados.getPointerLast().setIndice(6);
        listaEmpleados.add(an4);
        listaEmpleados.getPointerLast().setIndice(7);
        
        PanBtnInicio = new PanelBtnInicio(this);
        PanBtnInicio.setSize(600,200);
        PanContInicio = new PanelContentInicio(this);
        PanContInicio.setSize(600,400);
        PanBtnVisAsk = new PanelBtnVisualizarAsk(this);
        PanBtnVisAsk.setSize(600,200);
        PanContEmpVis = new PanelContentEmpleadoVis(this);
        PanContEmpVis.setSize(600,400);
        PanContEmpVisPro = new PanelContentEmpleadoVisPro(this);
        PanContEmpVisPro.setSize(250,250);
        PanContEmpVisAna = new PanelContentEmpleadoVisAna(this);
        PanContEmpVisAna.setSize(250,250);
        PanBtnEmpVis = new PanelBtnEmpleadoVis(this);
        PanBtnEmpVis.setSize(600,200);
        PanBtnGuaFic = new PanelBtnGuardarFichero(this);
        PanBtnGuaFic.setSize(600,200);
        PanBtnList = new PanelBtnListado(this);
        PanBtnList.setSize(600,200);
        PanContList = new PanelContentListado(this);
        PanContList.setSize(600,400);
        
        
        
        PanelContent.removeAll();
        PanelContent.add(PanContInicio, BorderLayout.CENTER);
        PanelContent.setVisible(true);
        
        PanelBotones.removeAll();
        PanelBotones.add(PanBtnInicio, BorderLayout.CENTER);
        PanelBotones.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelContent = new javax.swing.JPanel();
        PanelBotones = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(505, 300));

        PanelContent.setMinimumSize(new java.awt.Dimension(600, 300));
        PanelContent.setPreferredSize(new java.awt.Dimension(600, 300));

        javax.swing.GroupLayout PanelContentLayout = new javax.swing.GroupLayout(PanelContent);
        PanelContent.setLayout(PanelContentLayout);
        PanelContentLayout.setHorizontalGroup(
            PanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        PanelContentLayout.setVerticalGroup(
            PanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );

        getContentPane().add(PanelContent, java.awt.BorderLayout.CENTER);

        PanelBotones.setPreferredSize(new java.awt.Dimension(600, 200));

        javax.swing.GroupLayout PanelBotonesLayout = new javax.swing.GroupLayout(PanelBotones);
        PanelBotones.setLayout(PanelBotonesLayout);
        PanelBotonesLayout.setHorizontalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        PanelBotonesLayout.setVerticalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        getContentPane().add(PanelBotones, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }
    
    public void showPanelContent(){
        PanelContent.setVisible(true);
    }
    
    public JPanel getPanelContent(){
        return PanelContent;
    }
    
    public void showPanelBotones(){
        PanelBotones.setVisible(true);
    }
    
    public JPanel getPanelBotones(){
        return PanelBotones;
    }
    
    public MyList getListaEmpleados(){
        return listaEmpleados;
    }
    
    // si es true avanza al siguiente, si es falso retrocede
    public void updatePanelContentEmpleadoVisBoxes(boolean forwrdBackrw){
        if(forwrdBackrw)
            listaEmpleados.getNext();
        else
            listaEmpleados.getPrevious();
        
        getTypeEmpleadoPanel();
        PanContEmpVis.fillBoxes(listaEmpleados);
    }
    
    // si es true primero, si es false ultimo
    public void updatePanelContentEmpleadoVisBoxesFL(boolean firstLast){
        if(firstLast)
            listaEmpleados.getFirst();
        else
            listaEmpleados.getLast();
        
        getTypeEmpleadoPanel();
        PanContEmpVis.fillBoxes(listaEmpleados);
    }
    
    public void getTypeEmpleadoPanel(){
        Empleado aux = (Empleado) listaEmpleados.getCurrentNode().getMain();
        if(aux instanceof Programador){
            Programador auxPro = (Programador) aux;
            PanContEmpVis.swapContentPanelEmpleadoVisPro(auxPro);
        }else if(aux instanceof Analista){
            Analista auxAna = (Analista) aux;
            PanContEmpVis.swapContentPanelEmpleadoVisAna(auxAna);
        }
    }
    
    public void empleadoFromListHasBeenChosen(){
        PanBtnList.setBtnMostrar(true);
    }
    
    public void setEmpleadoFromList(){
        if(PanContList.returnEmpleadoChosen() != null){
            listaEmpleados.getFirst();
            do{
                if(listaEmpleados.getCurrentNode().getMain() == PanContList.returnEmpleadoChosen()){
                    PanContEmpVis.fillBoxes(listaEmpleados);
                    getTypeEmpleadoPanel();
                    PanContEmpVis.fillBoxes(listaEmpleados);
                    if(listaEmpleados.getCurrentNode().isFirst()){
                        PanBtnEmpVis.setSigAntButMixto(false);
                    }else if(listaEmpleados.getCurrentNode().isLast()){
                        PanBtnEmpVis.setSigAntButMixto(true);
                    }else{
                        PanBtnEmpVis.setSigAntButSame(true);
                    }
                    break;
                }else
                    listaEmpleados.getNext();
            }while(!listaEmpleados.isLast());
            System.out.println("Current node: "+listaEmpleados.getCurrentNode().getMain());
        }else{
            System.out.println("No se ha encontrado empleado o no se ha seleccionado.");
        }
    }
    
    // este metodo difenrecia si se esta mostrando el empleado individual desde uno a uno o desde el listado
    public void setModeVerEmpleados(){
        
    }
    
    // panelType es si queremos cambiar: true-> content, false -> botones
    public void actOfSwapping(JPanel panel, boolean panelType){
        JPanel panelAux = (panelType)? PanelContent:PanelBotones;
        panelAux.removeAll();
        panelAux.add(panel, BorderLayout.CENTER);
        panelAux.setVisible(true);
        panelAux.revalidate();
        panelAux.repaint();
    }
    
    public void swapBotonPanelVisuMenu(){
        actOfSwapping(PanBtnVisAsk, false);
    }
    
    public void swapBotonPanelBtnInicio(){
        actOfSwapping(PanBtnInicio, false);
    }
    
    public void swapContentPanelEmpleadoVis(){
        actOfSwapping(PanContEmpVis, true);
        getTypeEmpleadoPanel();
    }
    
    public void swapContentPanelInicio(){
        actOfSwapping(PanContInicio, true);
    }
    
    public void swapBotonPanelEmpleadoVis(){
        actOfSwapping(PanBtnEmpVis, false);
    }
    
    public void swapBotonPanelGuardarFichero(){
        actOfSwapping(PanBtnGuaFic, false);
    }
    
    public void swapBotonPanelListado(){
        actOfSwapping(PanBtnList, false);
    }
    
    public void swapContentPanelListado(){
        actOfSwapping(PanContList, true);
    }
    
    public static GregorianCalendar getRandomLogicalDate(){
        Random rand = new Random();
        GregorianCalendar gc = new GregorianCalendar();
        int rndYear = rand.nextInt(33)+1990;
        int rndMonth = rand.nextInt(12)+1;
        int leapState = 28;
        int daysInMonth = -1;
        
        gc.set(GregorianCalendar.YEAR, rndYear);
        if((rndYear%4==0 && rndYear%100!=0)||(rndYear%400==0))
            leapState =29;
        gc.set(GregorianCalendar.MONTH, rndMonth);
        switch (rndMonth) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = leapState;
                break;
            default:
                daysInMonth = -1; // Indicate an invalid month
                break;
        }
        gc.set(GregorianCalendar.DATE, rand.nextInt(daysInMonth)+1);
        
        return gc;
    }
    
    public static GregorianCalendar setDate(int dia, int mes, int anio){
        GregorianCalendar gc = new GregorianCalendar();
        gc.set(GregorianCalendar.DAY_OF_MONTH, dia);
        gc.set(GregorianCalendar.MONTH, mes);
        gc.set(GregorianCalendar.YEAR, anio);
        return gc;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelContent;
    // End of variables declaration//GEN-END:variables
}
