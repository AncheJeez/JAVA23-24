package java02;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;



public class main {
    
    public static void main(String[] args) {
        
        // instanciamos 4 objetos de tipo Empleado
        Empleado emple1 = new Empleado("Pepe","Sanchez", 2000);
        Empleado emple2 = new Empleado("Manolo","Naranjo", 300, 2500);
        Empleado emple3 = new Empleado("Lola","Gonzalez", 1000);
        Empleado emple4 = new Empleado("Elena","Lopez", 500, 1500);
        Empleado emple5 = new Empleado("Angel","Perez", 1500);
        
        runMyAPP();
//        System.out.println("ACTUAL "+Empleado.getActualEmpleado().toString());
//        System.out.println("PRIMER "+Empleado.getPrimerEmpleado().toString());
//        Empleado.avanzar();
//        System.out.println("ACTUAL "+Empleado.getActualEmpleado().toString());
//        System.out.println("PRIMER "+Empleado.getPrimerEmpleado().toString());
//        Empleado.avanzar();
//        System.out.println("ACTUAL "+Empleado.getActualEmpleado().toString());
//        System.out.println("PRIMER "+Empleado.getPrimerEmpleado().toString());
//        Empleado.avanzar();
//        System.out.println("ACTUAL "+Empleado.getActualEmpleado().toString());
//        System.out.println("PRIMER "+Empleado.getPrimerEmpleado().toString());
//        Empleado.avanzar();
//        System.out.println("ACTUAL "+Empleado.getActualEmpleado().toString());
//        System.out.println("PRIMER "+Empleado.getPrimerEmpleado().toString());
//        System.out.println(Empleado.getNumEmpleado());
        
    }
    
    public static void runMyAPP(){
        
        // set look and feel
        try {
            UIManager.setLookAndFeel(
                UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) { }
        
        //Crea el contenedor de más alto nivel y le añade contenido.
        JFrame frame = new JFrame("AplicacionSwing");
        APPSwing app = new APPSwing();
        
        // metemos los componentes y el layout de la interfaz
        Component contentsInfoEmpleados = app.establecerLayout();
        
        // introducimos el primer objeto de la lista
        app.fillBoxes(Empleado.getActualEmpleado());
        
        frame.getContentPane().add(contentsInfoEmpleados, BorderLayout.CENTER);
        frame.setMinimumSize(new Dimension(450,400));
        
        //Termina de ubicar el frame y lo muestra.
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        
        frame.pack();
        //frame.setSize(600,600);
        frame.setVisible(true);
    }
}
