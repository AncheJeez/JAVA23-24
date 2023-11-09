/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.MyList;
import Modelo.Analista;
import Modelo.CustomException;
import Modelo.Empleado;
import Modelo.Programador;
import static Vista.mainTerminal.getRandomLogicalDate;
import static Vista.mainTerminal.setDate;
import java.awt.BorderLayout;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author andres
 */

// QUEDA POR HACER EL BOTON DE ORDENAR EN EL JLIST PANEL Y EL BOTON DE CREAR EN MASA

//178, 102, 255
//255, 102, 178
public class JFramePrincipal extends javax.swing.JFrame {

    private MyList listaEmpleados = new MyList();
    // este es para cuando seleccionamos UN empleado de el JList
    private Empleado empleadoSeleccionado = null;
    private int numCreaMasiv = 100000;
    
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
    private PanelBtnCargarFichero PanBtnCarFic;
    private PanelBtnCrearAsk PanBtnCreAsk;
    private PanelBtnEmpleadoCre PanBtnEmpCre;
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
        GregorianCalendar gcBad = new GregorianCalendar();
        GregorianCalendar gc = setDate(gcBad.get(GregorianCalendar.DAY_OF_MONTH),gcBad.get(GregorianCalendar.MONTH)+1,gcBad.get(GregorianCalendar.YEAR));
        
        GregorianCalendar gcr1 = getRandomLogicalDate();
        Programador pro1 = new Programador(1,"Andres","Sanchez",2100,6000, gc,30,"Java");
        Programador pro2 = new Programador(2, "Angel", "Gonzalez",1350, 8000, setDate(gc.get(GregorianCalendar.DAY_OF_MONTH),gc.get(GregorianCalendar.MONTH),(gc.get(GregorianCalendar.YEAR)-1)),25,"C#");
        Programador pro3 = new Programador(3,"Sandra","Naranjo",1500,4500, gcr1,60,"Python");
        Programador pro4 = new Programador(4,"Ale","Benitez",2000,2100,setDate(gc.get(GregorianCalendar.DAY_OF_MONTH),gc.get(GregorianCalendar.MONTH),(gc.get(GregorianCalendar.YEAR)-1)),250,"Rust");
        Programador pro5 = new Programador(5, "Ana","Cala",3000,3200,setDate(gc.get(GregorianCalendar.DAY_OF_MONTH),gc.get(GregorianCalendar.MONTH),(gc.get(GregorianCalendar.YEAR)-2)),300,"C++");
        
        GregorianCalendar gcr2 = getRandomLogicalDate();
        Analista an1 = new Analista(6,"Pepe","Lopez",2100,6000, gc,2,8);
        Analista an2 = new Analista(7, "Maria", "Vazquez",1350, 8000, setDate(gc.get(GregorianCalendar.DAY_OF_MONTH),gc.get(GregorianCalendar.MONTH),(gc.get(GregorianCalendar.YEAR)-1)),5,22);
        Analista an3 = new Analista(8,"Francisco","Gomez",1500,4500, gcr2,8,3);
        Analista an4 = new Analista(9,"Lola","Fernandez",2000,2100,setDate(gc.get(GregorianCalendar.DAY_OF_MONTH),gc.get(GregorianCalendar.MONTH),(gc.get(GregorianCalendar.YEAR)-1)),30,4);
        Analista an5 = new Analista(10,"Elena","Castro",3000,3200,setDate(gc.get(GregorianCalendar.DAY_OF_MONTH),gc.get(GregorianCalendar.MONTH),(gc.get(GregorianCalendar.YEAR)-2)),300,3);
        
        
        
        
        // listado ordenado
//        listaEmpleados.add(pro1);
//        listaEmpleados.getPointerLast().setIndice(0);
//        listaEmpleados.add(pro2);
//        listaEmpleados.getPointerLast().setIndice(1);
//        listaEmpleados.add(pro3);
//        listaEmpleados.getPointerLast().setIndice(2);
//        listaEmpleados.add(pro4);
//        listaEmpleados.getPointerLast().setIndice(3);
//        listaEmpleados.add(an1);
//        listaEmpleados.getPointerLast().setIndice(4);
//        listaEmpleados.add(an2);
//        listaEmpleados.getPointerLast().setIndice(5);
//        listaEmpleados.add(an3);
//        listaEmpleados.getPointerLast().setIndice(6);
//        listaEmpleados.add(an4);
//        listaEmpleados.getPointerLast().setIndice(7);
        
        // listado desordenado
        listaEmpleados.add(an4);
        listaEmpleados.getPointerLast().setIndice(an4.getNumero());
        listaEmpleados.add(an3);
        listaEmpleados.getPointerLast().setIndice(an3.getNumero());
        listaEmpleados.add(an2);
        listaEmpleados.getPointerLast().setIndice(an2.getNumero());
        listaEmpleados.add(an1);
        listaEmpleados.getPointerLast().setIndice(an1.getNumero());
        listaEmpleados.add(pro4);
        listaEmpleados.getPointerLast().setIndice(pro4.getNumero());
        listaEmpleados.add(pro3);
        listaEmpleados.getPointerLast().setIndice(pro3.getNumero());
        listaEmpleados.add(pro2);
        listaEmpleados.getPointerLast().setIndice(pro2.getNumero());
        listaEmpleados.add(pro1);
        listaEmpleados.getPointerLast().setIndice(pro1.getNumero());
        listaEmpleados.add(an5);
        listaEmpleados.getPointerLast().setIndice(an5.getNumero());
        listaEmpleados.add(pro5);
        listaEmpleados.getPointerLast().setIndice(pro5.getNumero());
        
        
        PanBtnInicio = new PanelBtnInicio(this);
        PanBtnInicio.setSize(600,200);
        PanContInicio = new PanelContentInicio(this);
        PanContInicio.setSize(600,400);
        PanBtnVisAsk = new PanelBtnVisualizarAsk(this);
        PanBtnVisAsk.setSize(600,200);
        PanContEmpVis = new PanelContentEmpleadoVis(this, true);// este boolean represeta si esta en modo visualizar o crear, al crearlo lo ponemos por defecto pero se podra modf
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
        PanBtnCarFic = new PanelBtnCargarFichero(this);
        PanBtnCarFic.setSize(600,200);
        PanBtnCreAsk = new PanelBtnCrearAsk(this);
        PanBtnCreAsk.setSize(600,200);
        PanBtnEmpCre = new PanelBtnEmpleadoCre(this);
        PanBtnEmpCre.setSize(600,200);
        
        
        
        
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
    
    public void refreshPanelContentEmpleado(){
        getTypeEmpleadoPanel();
        PanContEmpVis.fillBoxes(listaEmpleados);
    }
    
    // si es true avanza al siguiente, si es falso retrocede
    public void updatePanelContentEmpleadoVisBoxes(boolean forwrdBackrw){
        if(forwrdBackrw)
            listaEmpleados.getNext();
        else
            listaEmpleados.getPrevious();
        
        refreshPanelContentEmpleado();
    }
    
    // si es true primero, si es false ultimo
    public void updatePanelContentEmpleadoVisBoxesFL(boolean firstLast, boolean movePanel){
        if(firstLast)
            listaEmpleados.getFirst();
        else
            listaEmpleados.getLast();
        if(movePanel)
            refreshPanelContentEmpleado();
    }
    
    // cuando estamos creando, el panel del tipo del empleado sera el del filtro
    public void putFilterEmpleadoPanel(boolean type){
        if(!type){
            PanContEmpVis.swapContentPanelEmpleadoVisAna();
        }else{
            PanContEmpVis.swapContentPanelEmpleadoVisPro();
        }
    }
    
    // pillamos el tipo: pro o ana, del current empleado a mostrar
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
            while(true){
                if(listaEmpleados.getCurrentNode().getMain() == PanContList.returnEmpleadoChosen()){
                    PanContEmpVis.fillBoxes(listaEmpleados);
                    refreshPanelContentEmpleado();
                    if(listaEmpleados.getCurrentNode().isFirst()){
                        PanBtnEmpVis.setSigAntButMixto(false);
                    }else if(listaEmpleados.getCurrentNode().isLast()){
                        PanBtnEmpVis.setSigAntButMixto(true);
                    }else{
                        PanBtnEmpVis.setSigAntButSame(true);
                    }
                    break;
                }
                if(!listaEmpleados.getCurrentNode().isLast()){
                    listaEmpleados.getNext();
                }else{
                    break;
                }
            }
            System.out.println("Current node: "+listaEmpleados.getCurrentNode().getMain());
        }else{
            System.out.println("No se ha encontrado empleado o no se ha seleccionado.");
        }
    }
    
    // este metodo difenrecia si se esta mostrando el empleado individual desde uno a uno o desde el listado
    public void setModeVerEmpleados(){
        
    }
    
    // esta es el metodo que se utiliza cuando se calcule el nuevo saldo del empleado current
    public void calcModfSaldo(){
        Empleado aux = (Empleado) listaEmpleados.getCurrentNode().getMain();
        try{
            aux.checkCumpleMesAnio();
            listaEmpleados.updateCurrentNode(aux);
            refreshPanelContentEmpleado();
            PanBtnEmpVis.setTextOfInfoLabel("Calculo realizado",true);
        }catch(CustomException excep){
            //System.out.println(excep.getMessage());
            PanBtnEmpVis.setTextOfInfoLabel(excep.getMessage(),false);
        }
    }
    
    public void addFromFileToList(MyList listaFromFile){
        // ponemos la lista del fichero en la primera posicion
        listaFromFile.getFirst();
        do{
            // añadimos a la lista principal
            Empleado emp = (Empleado)listaFromFile.getCurrentNode().getMain();
            listaEmpleados.add(emp);
            listaEmpleados.getPointerLast().setIndice(emp.getNumero());
            // avanzamos
            listaFromFile.getNext();
        }while(!listaFromFile.getCurrentNode().isLast());

        callThisWhenModifyMainList();
    }
    
    public void overWriteFileToList(MyList listaFromFile){
        listaFromFile.getFirst();
        int lastIndex = 0;
        
        listaEmpleados.deleteAll();
        do{
            lastIndex++;
            // añadimos a la lista principal
            Empleado emp = (Empleado)listaFromFile.getCurrentNode().getMain();
            listaEmpleados.add(emp);
            listaEmpleados.getPointerLast().setIndice(emp.getNumero());
            // avanzamos
            listaFromFile.getNext();
        }while(!listaFromFile.getCurrentNode().isLast());
        
        callThisWhenModifyMainList();
    }
    
    public void callThisWhenModifyMainList(){
        refreshPanelContentEmpleado();
        PanBtnEmpVis.refreshBotonesEmpleadoVis();
        PanBtnInicio.modifyLabelListaState();
        PanContList.setUpLista(true);
    }
    
    public void modifyMainList(){
        PanContList.setUpLista(false);
    }
    
    public Empleado getDataFromBoxes(){
        // el pillar el contenido de el tipo de empleado lo hacemos dentro del metodo getContentFromBoxes()
        Empleado emp = (Empleado) PanContEmpVis.getContentFromBoxes(PanBtnEmpCre.getTypeEmple());
        if(emp.getNumero()==0||emp.getNumero()<0){
            String message = "ERROR NUM EMPLEADO NO VALIDO";
            JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",JOptionPane.ERROR_MESSAGE);
        }else if(emp.getSaldo()>emp.getSaldoMax()){
            String message = "ERROR SALDO SUPERA SALDO MAXIMO ESTABLECIDO";
            JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",JOptionPane.ERROR_MESSAGE);
        }else{
            // cuando se crea el empleado exitosamente
            String message = "EMPLEADO CREADO";
            JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",JOptionPane.PLAIN_MESSAGE);
            listaEmpleados.add(emp);
            listaEmpleados.getPointerLast().setIndice(emp.getNumero());
            modifyMainList();
            PanContEmpVis.emptyInnerBoxes(PanBtnEmpCre.getTypeEmple());
        }
        return emp;// con este return al panel boton mandamos al usuario por labels los errores que tiene el empleado
    }
    
    public void sortMyList(){
        long startTimeColletion = System.currentTimeMillis();
        List<Empleado> empleadoList = new ArrayList<>();
        int cont = 0;
        listaEmpleados.getFirst();
        if(!listaEmpleados.isEmpty()){
            while(true){
                if(listaEmpleados.getCurrentNode().getMain() instanceof Empleado){
                    // guardamos el empleado en una lista auxiliar
                    Empleado emp = (Empleado) listaEmpleados.getCurrentNode().getMain();
                    empleadoList.add(emp); 
                }
                cont++;
                if(!listaEmpleados.getCurrentNode().isLast()){
                    listaEmpleados.getNext();
                }else{
                    break;
                }
            }
        }
        
        Comparator<Empleado> empleadoComparator = new Comparator<Empleado>() {
            @Override
            public int compare(Empleado emp1, Empleado emp2) {
                if(emp1.getNumero() >emp2.getNumero()){
                    return 1;
                }else{
                    return 0;
                }
            }
        };
        empleadoList.sort(empleadoComparator);
        
        long endTimeCollection = System.currentTimeMillis();
        long elapsedTimeCollection = endTimeCollection - startTimeColletion;
        String firstSort = "Collection time: "+elapsedTimeCollection;
                
                
        long startTimeListaEmpleados = System.currentTimeMillis();
        listaEmpleados.sort();
        long endTimeListaEmpleados = System.currentTimeMillis();
        long elapsedTimeListaEmpleados = endTimeListaEmpleados - startTimeListaEmpleados;
        String secondSort = "MyList time: " + elapsedTimeListaEmpleados;
        
        CustomDialog showTime = new CustomDialog(firstSort, secondSort);
        showTime.setVisible(true);
        callThisWhenModifyMainList();
    }
    
    public void massCreation(){
        ProgressDemo demo = new ProgressDemo();
        demo.setVisible(true);
        EmployeeCreationWorker worker = new EmployeeCreationWorker(numCreaMasiv, listaEmpleados, demo, this);
        worker.execute();
    }
    
    public int getMaxCreation(){
        return numCreaMasiv;
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
    
    public void swapBotonPanelVisuMenu(boolean state){
        actOfSwapping(PanBtnVisAsk, false);
        PanContEmpVis.visualOrCreateState(state);
    }
    
    public void swapBotonPanelBtnInicio(){
        actOfSwapping(PanBtnInicio, false);
    }
    
    public void swapContentPanelEmpleadoVis(boolean withContent){
        actOfSwapping(PanContEmpVis, true);
        if(withContent)
            getTypeEmpleadoPanel();
        else
            putFilterEmpleadoPanel(true);
        // true aqui significa que pone el de por defecto -> programador
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
    
    public void swapBotonPanelCargarFichero(){
        actOfSwapping(PanBtnCarFic, false);
    }
    
    public void swapBotonPanelCrearMenu(boolean state){
        actOfSwapping(PanBtnCreAsk,false);
        PanContEmpVis.visualOrCreateState(state);
    }
    
    public void swapBotonPanelEmpleadoCre(){
        actOfSwapping(PanBtnEmpCre, false);
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
