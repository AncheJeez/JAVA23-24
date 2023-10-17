package Vista;

import Controlador.MyList;
import Modelo.Empleado;
import java.util.Calendar;
import static java.util.Calendar.*;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Vector;


//POR HACER
/*
    LOS BOTONES A VECES NO FUNCIONAN CORRECTAMENTE, SE DESABILITAN CUANDO NO DEBEN Y VICEVERSA

    EL MOSTRAR POR FILTRO DE NUEVOS EMPLEADOS CREADOS NO FUNCIONA
*/


public class VistaMenu extends javax.swing.JFrame {

    private MyList listaEmpleados;
    private MyList savedOGList;
    
    boolean createState = false;
    boolean modifyState = false;
    
    boolean btnSigState;
    boolean btnAntState;
    
    boolean isFiltered = false;
    
    public VistaMenu() {
        initComponents();
        
        // creamos nuestar lista de empleados
        listaEmpleados = new MyList();
        
        // insertamos empleados
//        for(int i=0;i<5;i++){
//            Empleado e = new Empleado(i+1);
//            listaEmpleados.add(e);
//        }
        
        GregorianCalendar gc = getRandomLogicalDate();
        Empleado e1 = new Empleado(1,"Andres","Sanchez",2000, gc);
        listaEmpleados.add(e1);
        Empleado e2 = new Empleado(2,"Pepe","Garcia",2300, gc);
        listaEmpleados.add(e2);
        
        gc = getRandomLogicalDate();
        Empleado e3 = new Empleado(3,"Maria","Benitez",1350, gc);
        listaEmpleados.add(e3);
        Empleado e4 = new Empleado(4,"Carmen","Blanco",3150, gc);
        listaEmpleados.add(e4);
        
        gc = getRandomLogicalDate();
        Empleado e5 = new Empleado(5,"Jaime","Gonzalez",2700, gc);
        listaEmpleados.add(e5);
        Empleado e6 = new Empleado(6,"Sandra","Naranjo",4500, gc);
        listaEmpleados.add(e6);
        
        savedOGList = copyMyList(listaEmpleados);
        
        fillBoxes(listaEmpleados);
        startButtonStates(listaEmpleados);
        updateFilter(listaEmpleados);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txNombre = new javax.swing.JTextField();
        txApellido = new javax.swing.JTextField();
        txSaldo = new javax.swing.JTextField();
        txNumero = new javax.swing.JTextField();
        txFechaAlta = new javax.swing.JTextField();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        filterComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Numero:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Saldo:");

        jLabel5.setText("Fecha alta:");

        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        filterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        filterComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAnterior)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(txApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txNumero, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txFechaAlta)
                                    .addComponent(txSaldo)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSiguiente))))
                    .addComponent(filterComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrar)
                        .addGap(12, 12, 12)
                        .addComponent(btnModificar)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(filterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnterior)
                    .addComponent(btnSiguiente))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnBorrar)
                    .addComponent(btnModificar))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        
        if(!listaEmpleados.isLast()){
            btnAnterior.setEnabled(true);
            btnSiguiente.setEnabled(true);
            listaEmpleados.getNext();
            fillBoxes(listaEmpleados);
            if(listaEmpleados.isLast() || listaEmpleados.isEmpty())
                btnSiguiente.setEnabled(false);
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        
        if(!listaEmpleados.isFirst()){
            btnSiguiente.setEnabled(true);
            btnAnterior.setEnabled(true);
            listaEmpleados.getPrevious();
            fillBoxes(listaEmpleados);
            if(listaEmpleados.isFirst() || listaEmpleados.isEmpty())
                btnAnterior.setEnabled(false);
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        
        if(createState == false){
            emptyBoxes();
            createState = true;
            txFechaAlta.setText("Campo automatico");
            btnSigState = btnSiguiente.isEnabled();
            btnAntState = btnAnterior.isEnabled();
            btnSiguiente.setEnabled(false);
            btnAnterior.setEnabled(false);
            btnModificar.setEnabled(false);
            btnBorrar.setText("Cancelar");
            btnBorrar.setEnabled(true);
        }else{
            if(txNumero.getText().isEmpty()){
                txNumero.setText("Campo obligatorio");
            }
            else{
                Empleado newEmpleado = getInfoFromCurrentBoxes();
                listaEmpleados.add(newEmpleado);
                updateFilter(listaEmpleados);
                savedOGList = copyMyList(listaEmpleados);
                
                if(listaEmpleados.getCont()<=1){
                    btnSiguiente.setEnabled(btnSigState);   
                }else
                    btnSiguiente.setEnabled(true);
                btnAnterior.setEnabled(btnAntState);
                btnModificar.setEnabled(true);
                btnBorrar.setText("Borrar");
                createState = false;
                
                fillBoxes(listaEmpleados);
            }
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if(createState == false && modifyState == false){
            System.out.println(listaEmpleados.getCurrentNode().getMain());
            listaEmpleados.remove(listaEmpleados.getCurrentNode().getMain());
            fillBoxes(listaEmpleados);
            System.out.println("EMPLEADO BORRADO");
            listaEmpleados.showMyList();
            savedOGList = copyMyList(listaEmpleados);
            
            updateFilter(listaEmpleados);
            if(listaEmpleados.getCont() <= 1){
                btnSiguiente.setEnabled(false);
                if(listaEmpleados.isEmpty())
                    btnBorrar.setEnabled(false);
            }else
                btnSiguiente.setEnabled(true);
        }else{
            // esta parte de boton borrar forma parte del boton cancelar de crear
            btnBorrar.setEnabled(true);
            if(listaEmpleados.getCont()<=0)
                btnSiguiente.setEnabled(btnSigState);
            else
                btnSiguiente.setEnabled(true);
            btnAnterior.setEnabled(btnAntState);
            btnModificar.setEnabled(true);
            btnCrear.setEnabled(true);
            btnBorrar.setText("Borrar");
            createState = false;
            modifyState = false;
            fillBoxes(listaEmpleados);
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(modifyState == false){
            modifyState = true;
            txFechaAlta.setText("Campo automatico");
            btnSigState = btnSiguiente.isEnabled();
            btnAntState = btnAnterior.isEnabled();
            btnSiguiente.setEnabled(false);
            btnAnterior.setEnabled(false);
            btnCrear.setEnabled(false);
            btnBorrar.setText("Cancelar");
        }else{
            Empleado modifiedEmpleado = getInfoFromCurrentBoxes();
            listaEmpleados.modify(listaEmpleados.getCurrentNode().getMain(), modifiedEmpleado);
            savedOGList = copyMyList(listaEmpleados);
            
            if(listaEmpleados.getCont()<=0)
                btnSiguiente.setEnabled(btnSigState);
            else
                btnSiguiente.setEnabled(true);
            btnAnterior.setEnabled(btnAntState);
            btnCrear.setEnabled(true);
            btnBorrar.setText("Borrar");
            modifyState = false;
            
            fillBoxes(listaEmpleados);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    // date filter
    private void filterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterComboBoxActionPerformed
        String filterDate = (String) filterComboBox.getSelectedItem();

        if (filterDate != null && !filterDate.equals("SHOW ALL")) {
            if (isFiltered) {
                // Reset to the original list
                resetListEmpleados();
            }

            // Create a copy of the current listaEmpleados
            MyList filteredList = copyMyList(listaEmpleados);

            // Filter the copied list
            haveOnlyContentFromGivenDate(filteredList, filterDate);

            fillBoxes(listaEmpleados);

            isFiltered = true;
        } else {
            // If "SHOW ALL" is selected, reset to the original list
            if(isFiltered){
                resetListEmpleados();
                System.out.println("SHOW ALL");
                fillBoxes(listaEmpleados);
                isFiltered = false;
            }
        }
    }//GEN-LAST:event_filterComboBoxActionPerformed
    
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
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMenu().setVisible(true);
            }
        });
    }
    
    public void startButtonStates(MyList lista){
        if(lista.isEmpty()){
            btnSiguiente.setEnabled(false);
        }
        // da igual si esta vacia o no la lista, por que empezamos en el primero, asi que
        // no hay anterior
        btnAnterior.setEnabled(false);
    }
    
    public void fillBoxes(MyList lista){
        if(!lista.isEmpty()){
            Empleado aux = (Empleado)lista.getPointerActual().getMain();
            txApellido.setText(""+aux.getApellido());
            //txFechaAlta.setText(""+(aux.getFechaAlta()).toInstant());
            txFechaAlta.setText(""+(aux.getFechaAlta()).get(DAY_OF_MONTH)
                +"/"+(aux.getFechaAlta()).get(MONTH)
                +"/"+(aux.getFechaAlta()).get(YEAR));
            txNombre.setText(""+aux.getNombre());
            txNumero.setText(""+aux.getNumero());
            txSaldo.setText(""+aux.getSaldo());
        }else{
            emptyBoxes();
        }
    }
    
    public void emptyBoxes(){
        txApellido.setText("");
        txFechaAlta.setText("");
        txNombre.setText("");
        txNumero.setText("");
        txSaldo.setText("");
    }
    
    public Empleado getInfoFromCurrentBoxes(){
        int numero;
        String nombre;
        String apellido;
        double saldo;

        if(txNombre.getText().isEmpty())
            nombre = null;
        else
            nombre = txNombre.getText();
        if(txApellido.getText().isEmpty())
            apellido = null;
        else
            apellido = txApellido.getText();
        try{
            numero = Integer.parseInt(txNumero.getText());
        }catch(NumberFormatException e){
            System.out.println("El valor Numero no es un número válido o esta vacio.");
            numero = 0;
        }
        try{
            saldo = Double.parseDouble(txSaldo.getText());
        }catch(NumberFormatException e){
            System.out.println("El valor Saldo no es un número válido o esta vacio.");
            saldo = 0;
        }
        Empleado newEmpleado = new Empleado(numero,nombre,apellido,saldo);
        return newEmpleado;
    }
    
    public GregorianCalendar getRandomLogicalDate(){
        Random rand = new Random();
        GregorianCalendar gc = new GregorianCalendar();
        
        gc.set(GregorianCalendar.YEAR, rand.nextInt(123)+1900);
        gc.set(GregorianCalendar.MONTH, rand.nextInt(12)+1);
        gc.set(GregorianCalendar.DATE, rand.nextInt(28)+1);
        
        return gc;
    }
    
    public void updateFilter(MyList lista) {
        filterComboBox.removeAllItems();
        filterComboBox.addItem("SHOW ALL");
        Vector<GregorianCalendar> vector = new Vector<>();

        // Check if the list is empty or not
        if (lista.getCont() > 0) {
            for (int i = 1; i < lista.getCont() + 1; i++) {
                Empleado currentAux = (Empleado) lista.getNodeByPosition(i).getMain();
                // Check if the date already exists in the vector
                if (!dateExistsInVector(vector, currentAux.getFechaAlta())) {
                    vector.add(currentAux.getFechaAlta());
                }
            }
        }

        modifyComboBox(vector);
    }

    // Helper method to check if a date exists in the vector
    private boolean dateExistsInVector(Vector<GregorianCalendar> vector, GregorianCalendar date) {
    for (GregorianCalendar existingDate : vector) {
        if (existingDate.get(Calendar.YEAR) == date.get(Calendar.YEAR) &&
            existingDate.get(Calendar.MONTH) == date.get(Calendar.MONTH) &&
            existingDate.get(Calendar.DAY_OF_MONTH) == date.get(Calendar.DAY_OF_MONTH)) {
            return true;
        }
    }
    return false;
}
    
    public void modifyComboBox(Vector<GregorianCalendar> vector){
        
        for(int j=0;j<vector.size();j++){
            filterComboBox.addItem(""+(vector.get(j)).get(DAY_OF_MONTH)
            +"/"+(vector.get(j)).get(MONTH)
            +"/"+(vector.get(j)).get(YEAR));
        }
    }
    
    public void haveOnlyContentFromGivenDate(MyList savedOGList,String filterDate){
        MyList filteredList = new MyList();  // Create a new list for filtered results
    
        if (filterDate != null && !filterDate.equals("SHOW ALL")) {
            String[] dateParts = filterDate.split("/");
            Vector<Integer> dateNumbers = new Vector<>();

            if (dateParts.length == 3) {
                for (String part : dateParts) {
                    try {
                        int num = Integer.parseInt(part);
                        dateNumbers.add(num);
                    } catch (NumberFormatException e) {
                        System.out.println("DATE COULDN'T BE PARSED AS INTEGER");
                    }
                }
            } else {
                System.out.println("DATE DOESN'T HAVE 3 PARTS");
            }

            // Filter the data and add to the filteredList
            for (int i = 1; i <= savedOGList.getCont(); i++) {
                Empleado currentAux = (Empleado) savedOGList.getNodeByPosition(i).getMain();

                if (currentAux != null && dateNumbers.size() == 3
                        && currentAux.getFechaAlta().get(DAY_OF_MONTH) == dateNumbers.get(0)
                        && currentAux.getFechaAlta().get(MONTH) == dateNumbers.get(1)
                        && currentAux.getFechaAlta().get(YEAR) == dateNumbers.get(2)) {
                    filteredList.add(currentAux);
                }
            }
        }

        // Update listaEmpleados with the filtered results
        listaEmpleados = filteredList;

        // Optionally, show the filtered list if needed
        listaEmpleados.showMyList();
    }
    
    private MyList copyMyList(MyList source) {
        MyList copy = new MyList();
        for (int i = 1; i <= source.getCont(); i++) {
            Empleado currentAux = (Empleado) source.getNodeByPosition(i).getMain();
            copy.add(currentAux);
        }
        copy.setCont(source.getCont());
        return copy;
    }

    public void resetListEmpleados(){
        listaEmpleados = copyMyList(savedOGList);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> filterComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txApellido;
    private javax.swing.JTextField txFechaAlta;
    private javax.swing.JTextField txNombre;
    private javax.swing.JTextField txNumero;
    private javax.swing.JTextField txSaldo;
    // End of variables declaration//GEN-END:variables
}
