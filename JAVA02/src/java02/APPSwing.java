package java02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.concurrent.atomic.*;
import javax.swing.*;


public class APPSwing extends JFrame{
    
    private static String labelNombre = "Nombre:";
    private static String labelApellido = "Apellido:";
    private static String labelSueldo = "Sueldo(Opcional):";
    private static String labelSueldoMax = "Sueldo maximo:";
    private static String labelFecha = "Fecha:";
    
    private TextField nombreField;
    private TextField apellidoField;
    private TextField sueldoField;
    private TextField sueldoMaxField;
    private TextField fechaField;
    
    private static String buttonSiguiente = "Siguiente";
    private static String buttonAnterior = "Anterior";
    private static String buttonCrear = "Crear";
    

    public Component establecerLayout(){
        
        int auxCounter = 1;
        AtomicInteger counter = new AtomicInteger(auxCounter);
        
        //this boolean represent if the creation state its happening or not
        boolean creationState = false;
        AtomicBoolean createState = new AtomicBoolean(creationState);
        
        //this two booleans represent the state of the buttons
        boolean primerBotton = false;
        AtomicBoolean bottonState1 = new AtomicBoolean(primerBotton);
        boolean segundoBotton = false;
        AtomicBoolean bottonState2 = new AtomicBoolean(segundoBotton);
        
        //Panel principal
        JPanel mainPane = new JPanel();
        mainPane.setLayout(new GridLayout(0, 1));
        mainPane.setBorder(BorderFactory.createEmptyBorder(
                                        30, //arriba
                                        20, //izquierda
                                        30, //abajo
                                        20) //derecha
                                        );
        
        //Panel de los text boxes y labels
        JPanel infoPane = new JPanel();
        infoPane.setLayout(new GridLayout(0, 2));
        
        //Panel de los botones
        JPanel botonPane = new JPanel();
        botonPane.setLayout(new GridLayout(0,2,20,20));
        
        // creamos los labels
        final JLabel label1 = new JLabel(labelNombre);
        final JLabel label2 = new JLabel(labelApellido);
        final JLabel label3 = new JLabel(labelSueldo);
        final JLabel label4 = new JLabel(labelSueldoMax);
        final JLabel label5 = new JLabel(labelFecha);
        
        // creamos los textBoxes
        nombreField = new TextField(10);
        apellidoField = new TextField(10);
        sueldoField = new TextField(10);
        sueldoMaxField = new TextField(10);
        fechaField = new TextField(10);
        
        // tamaño del boton
        Dimension buttonSize = new Dimension(150, 50);
        
        // creamos los botones
        JButton button1 = new JButton(buttonAnterior);
        button1.setEnabled(false);
        button1.setPreferredSize(buttonSize);
        JButton button2 = new JButton(buttonSiguiente);
        button2.setPreferredSize(buttonSize);
        JButton button3 = new JButton(buttonCrear);
        button3.setPreferredSize(buttonSize);
        
        // DAMOS UN LISTENER A CADA BOTON ADEMAS DE UNA KEY
        button1.setMnemonic(KeyEvent.VK_S);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!createState.get()){
                    System.out.println("ANTERIOR");
                    // update the counter value
                    int currentCounterValue = counter.get();
                    System.out.println(currentCounterValue);
                    if(currentCounterValue > 0){
                        button1.setEnabled(true);
                        button2.setEnabled(true);
                        counter.decrementAndGet();
                        Empleado.retroceder();
                        fillBoxes(Empleado.getActualEmpleado());

                    currentCounterValue = counter.get();
                    if(currentCounterValue <= 1)
                        button1.setEnabled(false);
                    }
                }else{
                    //CANCELAR
                    fillBoxes(Empleado.getActualEmpleado());
                    if(bottonState1.get()){
                        bottonState1.set(false);
                        button1.setEnabled(false);
                    }
                    if(bottonState2.get()){
                        bottonState2.set(false);
                        button2.setEnabled(false);
                    }
                    button2.setText("Siguiente");
                    button1.setText("Anterior");
                    createState.set(false);
                    System.out.println("CREAR STATE: "+createState);
                    button3.setEnabled(true);
                }
            }
        });
        
        button2.setMnemonic(KeyEvent.VK_A);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!createState.get()){
                    System.out.println("SIGUIENTE");
                    // update the counter value
                    int currentCounterValue = counter.get();
                    System.out.println(currentCounterValue);
                    if(currentCounterValue < Empleado.getNumEmpleado()){
                        button2.setEnabled(true);
                        button1.setEnabled(true);
                        counter.incrementAndGet();
                        Empleado.avanzar();
                        fillBoxes(Empleado.getActualEmpleado());

                    currentCounterValue = counter.get();
                    if(currentCounterValue >= Empleado.getNumEmpleado())
                        button2.setEnabled(false);
                    }
                }else{
                    //ACEPTAR
                    //CREACION DEL EMPLEADO NUEVO
                    String nombre = nombreField.getText();
                    String apellido = apellidoField.getText();
                    // tenemos que comprobar que son o no float o int
                    String supposedString1 = sueldoField.getText();
                    String supposedString2 = sueldoMaxField.getText();
                    
                    boolean flagOpcionalInput = false;
                    
                    
                    float sueldo = 0;
                    try{
                        sueldo = Float.parseFloat(supposedString1);
                    }catch(NumberFormatException ex){
                        System.out.println("EL SUELDO INDICADO ES NULO O NO ES VALIDO");
                        sueldo = 0;
                        flagOpcionalInput = true;
                    }
                    
                    int sueldoMax = 0;
                    try{
                        sueldoMax = Integer.parseInt(supposedString2);
                    }catch(NumberFormatException ex){
                        System.out.println("EL SUELDO MAXIMO INCLUIDO NO ES VALIDO");
                        sueldoMax = 0;
                        
                    }
                    
                    if(flagOpcionalInput){
                        Empleado nuevoEmpleado = new Empleado(nombre,apellido, sueldoMax);
                    }else{
                        Empleado nuevoEmpleado = new Empleado(nombre,apellido, sueldo, sueldoMax);
                    }
                    System.out.println("EMPLEADO CREADO");
                    
                    //CERRAMOS LA CREACION DE EMPLEADO
                    fillBoxes(Empleado.getActualEmpleado());
                    // AQUI DA IGUAL QUE BOTON ACTIVAMOS O DESACTIVAMOS YA QUE EMPEZARA POR EL QUE
                    //ACABAMOS DE INTRODUCIR
//                    if(bottonState1.get()){
//                        bottonState1.set(false);
//                        button1.setEnabled(false);
//                    }
//                    if(bottonState2.get()){
//                        bottonState2.set(false);
//                        button2.setEnabled(false);
//                    }
                    // REESTABLECEMOS AL INICIAL
                    counter.set(1);
                    button1.setEnabled(false);
                    button2.setEnabled(true);
                    button2.setText("Siguiente");
                    button1.setText("Anterior");
                    createState.set(false);
                    System.out.println("CREAR STATE: "+createState);
                    button3.setEnabled(true);
                }
            }
        });
        
        button3.setMnemonic(KeyEvent.VK_C);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(createState.get() == false){
                    if(!button1.isEnabled()){
                        bottonState1.set(true);
                        button1.setEnabled(true);
                    }
                    if(!button2.isEnabled()){
                        bottonState2.set(true);
                        button2.setEnabled(true);
                    }
                    button2.setText("Aceptar");
                    button1.setText("Cancelar");
                    createState.set(true);
                    System.out.println("CREAR STATE: "+createState);
                    emptyBoxes();
                    button3.setEnabled(false);
                }
                else{
//                    if(bottonState1.get()){
//                        bottonState1.set(false);
//                        button1.setEnabled(false);
//                    }
//                    if(bottonState2.get()){
//                        bottonState2.set(false);
//                        button2.setEnabled(false);
//                    }
//                    button2.setText("Siguiente");
//                    button1.setText("Anterior");
//                    createState.set(false);
//                    System.out.println("CREAR STATE: "+createState);
                    ;
                }
            }
        });
        
        // añadimos los labels y textBoxes al infoPane, alternados para que aparezcan
        // uno al lado de otros
        infoPane.add(label1);
        infoPane.add(nombreField);
        infoPane.add(label2);
        infoPane.add(apellidoField);
        infoPane.add(label3);
        infoPane.add(sueldoField);
        infoPane.add(label4);
        infoPane.add(sueldoMaxField);
        infoPane.add(label5);
        infoPane.add(fechaField);
        
        // añadimos los botones
        botonPane.add(button1);
        botonPane.add(button2);
        botonPane.add(button3);
        
        // añadimos los panes secundarios a el principal
        mainPane.add(infoPane);
        mainPane.add(botonPane);
        
        return mainPane;
    }

    
    // this method fill the Boxes with the first one
    public void fillBoxes(Empleado emple){
        nombreField.setText(""+ emple.getNombre());
        apellidoField.setText(""+emple.getApellido());
        sueldoField.setText(""+emple.getSueldo());
        sueldoMaxField.setText(""+emple.getSueldoMaximo());
        fechaField.setText(""+(emple.getFechaAlta()).toInstant());
    }
    
    public void emptyBoxes(){
        nombreField.setText("");
        apellidoField.setText("");
        sueldoField.setText("");
        sueldoMaxField.setText("");
        fechaField.setText("SE REGISTRA AUTOMATICAMENTE");
    }
}
