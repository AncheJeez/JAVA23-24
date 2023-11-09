/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.MyList;
import Modelo.Analista;
import Modelo.Programador;
import java.util.List;
import java.util.Random;
import javax.swing.*;

public class EmployeeCreationWorker extends SwingWorker<Void, Integer> {
    private int numCreaMasiv;
    private MyList listaEmpleados;
    private ProgressDemo progressDemo;
    private JFramePrincipal frame;

    public EmployeeCreationWorker(int numCreaMasiv, MyList listaEmpleados, ProgressDemo progressDemo, JFramePrincipal frame) {
        this.numCreaMasiv = numCreaMasiv;
        this.listaEmpleados = listaEmpleados;
        this.progressDemo = progressDemo;
        this.frame = frame;
    }

    @Override
    protected Void doInBackground() {
        Random rand = new Random();
        // creamos los 20 primeros antes de los otros 100 para que entre en la lista limit a 100
        for(int i=0; i<20;i++){
            int num = rand.nextInt(2000)+1;
            int typeEmple = rand.nextInt(2);
            if(typeEmple == 1){// analista
                Analista ana = new Analista(num);
                listaEmpleados.add(ana);
                listaEmpleados.getPointerLast().setIndice(ana.getNumero());
            }else{// programador
                Programador pro = new Programador(num);
                listaEmpleados.add(pro);
                listaEmpleados.getPointerLast().setIndice(pro.getNumero());
            }
        }
        for (int i = 0; i < numCreaMasiv; i++) {
            int num = rand.nextInt(997999)+2001;
            int typeEmple = rand.nextInt(2);
            if(typeEmple == 1){// analista
                Analista ana = new Analista(num);
                listaEmpleados.add(ana);
                listaEmpleados.getPointerLast().setIndice(ana.getNumero());
            }else{// programador
                Programador pro = new Programador(num);
                listaEmpleados.add(pro);
                listaEmpleados.getPointerLast().setIndice(pro.getNumero());
            }
            publish(i +1);
        }
        return null;
    }

    @Override
    protected void process(List<Integer> chunks) {
        int latestProgress = chunks.get(chunks.size() - 1);
        progressDemo.progressBar.setValue(latestProgress);
        progressDemo.progressLabel.setText("Progress: " + (latestProgress * 100 / numCreaMasiv) + "%");
    }

    @Override
    protected void done() {
        frame.callThisWhenModifyMainList();
    }
}