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
import static Vista.JFramePrincipal.setDate;
import java.awt.BorderLayout;
import java.awt.Color;
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author andres
 */
public class PanelContentEmpleadoVis extends javax.swing.JPanel {

    private JFramePrincipal JFrame;
    private boolean state;
    private PanelContentEmpleadoVisPro PanelPro;
    private PanelContentEmpleadoVisAna PanelAna;
    
    /**
     * Creates new form PanelContentVisualizar
     */
    public PanelContentEmpleadoVis(JFramePrincipal JFrame, boolean state) {
        initComponents();
        this.JFrame = JFrame;
        this.state = state;
        this.setSize(600, 350);
        this.setBackground(new Color(116, 245, 189));
        visualOrCreateState(state);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txBxNumero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txBxNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblFechaAltaTop = new javax.swing.JLabel();
        txBxApellido = new javax.swing.JTextField();
        txBxSaldo = new javax.swing.JTextField();
        txBxSaldoMax = new javax.swing.JTextField();
        txBxFechaAlta = new javax.swing.JTextField();
        PanelTipoEmpleado = new javax.swing.JPanel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        lblFechaAltaBot = new javax.swing.JLabel();

        txBxNumero.setText("jTextField1");

        jLabel1.setText("Número:");

        jLabel2.setText("Nombre:");

        txBxNombre.setText("jTextField2");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Saldo:");

        jLabel5.setText("SaldoMax:");

        lblFechaAltaTop.setText("Fecha Alta:");

        txBxApellido.setText("jTextField3");

        txBxSaldo.setText("jTextField4");

        txBxSaldoMax.setText("jTextField5");

        txBxFechaAlta.setText("jTextField6");

        PanelTipoEmpleado.setPreferredSize(new java.awt.Dimension(250, 250));

        javax.swing.GroupLayout PanelTipoEmpleadoLayout = new javax.swing.GroupLayout(PanelTipoEmpleado);
        PanelTipoEmpleado.setLayout(PanelTipoEmpleadoLayout);
        PanelTipoEmpleadoLayout.setHorizontalGroup(
            PanelTipoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
        );
        PanelTipoEmpleadoLayout.setVerticalGroup(
            PanelTipoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        lblFechaAltaBot.setText("Fecha Alta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(lblFechaAltaTop)
                    .addComponent(lblFechaAltaBot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txBxFechaAlta)
                        .addComponent(txBxSaldoMax)
                        .addComponent(txBxSaldo)
                        .addComponent(txBxApellido)
                        .addComponent(txBxNombre)
                        .addComponent(txBxNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(PanelTipoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelTipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txBxNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txBxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txBxApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txBxSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txBxSaldoMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFechaAltaTop)
                            .addComponent(txBxFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaAltaBot, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    // state? true-> visuali false-> creation
    public void visualOrCreateState(boolean state){
        lblFechaAltaTop.setVisible(state);
        lblFechaAltaBot.setVisible(!state);
        txBxFechaAlta.setVisible(state);
        dateChooser.setVisible(!state);
        setBoxesEditable(!state);
        if(state)
            fillBoxes(JFrame.getListaEmpleados());
        else if(!state)
            emptyBoxes();
    }
    
    public void swapContentPanelEmpleadoVisPro(){
        PanelPro = new PanelContentEmpleadoVisPro(JFrame);
        PanelPro.emptyBoxes();
        PanelPro.setBoxesEditable(true);
        PanelTipoEmpleado.removeAll();
        PanelTipoEmpleado.add(PanelPro, BorderLayout.CENTER);
        PanelTipoEmpleado.revalidate();
        PanelTipoEmpleado.repaint();
    }
    
    public void swapContentPanelEmpleadoVisPro(Programador pro){
        PanelPro = new PanelContentEmpleadoVisPro(JFrame);
        PanelPro.fillBoxes(pro);
        PanelPro.setBoxesEditable(false);
        PanelTipoEmpleado.removeAll();
        PanelTipoEmpleado.add(PanelPro, BorderLayout.CENTER);
        PanelTipoEmpleado.revalidate();
        PanelTipoEmpleado.repaint();
    }
    
    public void swapContentPanelEmpleadoVisAna(){
        PanelAna = new PanelContentEmpleadoVisAna(JFrame);
        PanelAna.emptyBoxes();
        PanelAna.setBoxesEditable(true);
        PanelTipoEmpleado.removeAll();
        PanelTipoEmpleado.add(PanelAna, BorderLayout.CENTER);
        PanelTipoEmpleado.revalidate();
        PanelTipoEmpleado.repaint();
    }
    
    public void swapContentPanelEmpleadoVisAna(Analista ana){
        PanelAna = new PanelContentEmpleadoVisAna(JFrame);
        PanelAna.fillBoxes(ana);
        PanelAna.setBoxesEditable(false);
        PanelTipoEmpleado.removeAll();
        PanelTipoEmpleado.add(PanelAna, BorderLayout.CENTER);
        PanelTipoEmpleado.revalidate();
        PanelTipoEmpleado.repaint();
    }
    
    public Programador getDataFromPro(){
        Programador pro = PanelPro.getDataBoxes();
        return pro;
    }
    
    public Analista getDataFromAna(){
        Analista ana = PanelAna.getDataBoxes();
        return ana;
    }
    
    public Empleado getContentFromBoxes(boolean typeEmple){
        int num = 0;
        String nombre=null, apellido=null;
        double saldo=0, saldoMax=0;
        GregorianCalendar fechaAlta;
        try{
            num = Integer.parseInt(txBxNumero.getText());
        }catch(NumberFormatException e){
            System.out.println("El valor Numero no es un número válido o esta vacio.");
        }
        nombre = (txBxNombre.getText().isEmpty())? null:txBxNombre.getText();
        apellido = (txBxApellido.getText().isEmpty())? null:txBxApellido.getText();
        try{
            saldo = Double.parseDouble(txBxSaldo.getText());
        }catch(NumberFormatException e){
            System.out.println("El saldo no es de tipo double.");
        }
        try{
            saldoMax = Double.parseDouble(txBxSaldoMax.getText());
        }catch(NumberFormatException e){
            System.out.println("El saldo no es de tipo double.");
        }
        Date date = dateChooser.getDate();
        GregorianCalendar gcBad = new GregorianCalendar();
        GregorianCalendar gc = setDate(gcBad.get(GregorianCalendar.DAY_OF_MONTH),gcBad.get(GregorianCalendar.MONTH)+1,gcBad.get(GregorianCalendar.YEAR));
        if(date != null){
            String str = date.toString();
            String[]splited = str.split("\\s+");//esto separa los espacios de la cadena -> Thu Nov 16 19:39:14 CET 2023
            int mes = getMes(splited[1]);
            gc = setDate(Integer.parseInt(splited[2]),mes,Integer.parseInt(splited[5]));
        }
        if(typeEmple){//programador
            // este tiene el contenido del panel del programador
            Programador proAux = getDataFromPro();
            double sueldoExtr = proAux.getSueldoExtra();
            String lengFav = proAux.getLengProgFav();

            // da iwal si no elegimos una fecha, ya que el gc introducido seria el del dia de hoy
            Programador pro = new Programador(num,nombre,apellido,saldo,saldoMax,gc,sueldoExtr,lengFav);
            return pro;
            
        }else{//analista
            
            Analista anaAux = getDataFromAna();
            double porctExtra = anaAux.getPorcetanjeExtra();
            int proyPart = anaAux.getNumProyParticp();
            
            Analista ana = new Analista(num,nombre,apellido,saldo,saldoMax,gc,porctExtra,proyPart);
            return ana;
        }
    }
    
    public int getMes(String mes){
        int mesInt;
        switch(mes){
            case"Jan":mesInt=1;break;
            case"Feb":mesInt=2;break;
            case"Mar":mesInt=3;break;
            case"Apr":mesInt=4;break;
            case"May":mesInt=5;break;
            case"Jun":mesInt=6;break;
            case"Jul":mesInt=7;break;
            case"Aug":mesInt=8;break;
            case"Sep":mesInt=9;break;
            case"Oct":mesInt=10;break;
            case"Nov":mesInt=11;break;
            case"Dec":mesInt=12;break;
            default:mesInt = 1;
        }
        return mesInt;
    }
    
    
    public GregorianCalendar setDate(int dia, int mes, int anio){
        GregorianCalendar gc = new GregorianCalendar();
        gc.set(GregorianCalendar.DAY_OF_MONTH, dia);
        gc.set(GregorianCalendar.MONTH, mes);
        gc.set(GregorianCalendar.YEAR, anio);
        return gc;
    }
    
    public void fillBoxes(MyList lista){
        if(!lista.isEmpty()){
            Empleado aux = (Empleado)lista.getPointerActual().getMain();
            txBxApellido.setText(""+aux.getApellido());
            //txFechaAlta.setText(""+(aux.getFechaAlta()).toInstant());
            txBxFechaAlta.setText(""+(aux.getFechaAlta()).get(DAY_OF_MONTH)
                +"/"+(aux.getFechaAlta()).get(MONTH)
                +"/"+(aux.getFechaAlta()).get(YEAR));
            txBxNombre.setText(""+aux.getNombre());
            txBxNumero.setText(""+aux.getNumero());
            txBxSaldo.setText(""+aux.getSaldo());
            txBxSaldoMax.setText(""+aux.getSaldoMax());
        }else{
            emptyBoxes();
        }
    }
    
    public void emptyBoxes(){
        txBxApellido.setText("");
        txBxFechaAlta.setText("");
        txBxNombre.setText("");
        txBxNumero.setText("");
        txBxSaldo.setText("");
        txBxSaldoMax.setText("");
    }
    
    public void emptyInnerBoxes(boolean typeEmple){
        emptyBoxes();
        // no se por q no puedo hacer q se borren los dos a la vez, pero bueno con este if else no me da error
        if(typeEmple)
            PanelPro.emptyBoxes();
        else
            PanelAna.emptyBoxes();
    }
    
    public void setBoxesEditable(boolean typeOfEditable){
        txBxApellido.setEditable(typeOfEditable);
        txBxFechaAlta.setEditable(typeOfEditable);
        txBxNombre.setEditable(typeOfEditable);
        txBxNumero.setEditable(typeOfEditable);
        txBxSaldo.setEditable(typeOfEditable);
        txBxSaldoMax.setEditable(typeOfEditable);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelTipoEmpleado;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblFechaAltaBot;
    private javax.swing.JLabel lblFechaAltaTop;
    private javax.swing.JTextField txBxApellido;
    private javax.swing.JTextField txBxFechaAlta;
    private javax.swing.JTextField txBxNombre;
    private javax.swing.JTextField txBxNumero;
    private javax.swing.JTextField txBxSaldo;
    private javax.swing.JTextField txBxSaldoMax;
    // End of variables declaration//GEN-END:variables
}
