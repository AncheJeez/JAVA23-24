/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import java.io.FileOutputStream;
import static java.util.Calendar.*;
import java.util.GregorianCalendar;

/**
 *
 * @author alumno
 */
public class Analista extends Empleado{
    
    private double porcentajeExtra;
    
    private int numProyParticp;
    
    // analista completo
    public Analista(int num, String name, String surName, double saldo, double saldoMax, GregorianCalendar gc, double porcetanjeExtra, int numProyParticp){
        super(num, name, surName, saldo, saldoMax, gc);
        this.porcentajeExtra = porcetanjeExtra;
        this.numProyParticp = numProyParticp;
    }
    //analista sin fecha
    public Analista(int num, String name, String surName, double saldo, double saldoMax, double porcetanjeExtra, int numProyParticp){
        super(num, name, surName, saldo, saldoMax);
        this.porcentajeExtra = porcetanjeExtra;
        this.numProyParticp = numProyParticp;
    }
    
    // analista de prueba
    public Analista(int num){
        super(num);
        this.porcentajeExtra = 0;
        this.numProyParticp = 0;
    }
    
    public void checkCumpleMesAnio() throws CustomException{
        int diaActual = diaHoy.get(DIA_DEL_MES);
        int mesActual = diaHoy.get(MES);
        if((getFechaAlta()).get(DAY_OF_MONTH) == diaActual && (getFechaAlta()).get(MONTH) == mesActual){
            double increment=(saldo*porcentajeExtra/100);
            double aux = saldo+increment; 
            if(aux <= saldoMax){
                setSaldo(aux);
                System.out.println("Cumple las condiciones, el nuevo saldo es: "+getSaldo()+"\n");
            }else
                throw new CustomException("Error: superaria el saldo maximo indicado: "+getSaldoMax()+"\n");
        }else{
            System.out.println("No cumple año, fecha del empleado: "+getFechaAltaString()+"\n");
        }
    }
    
    // para analista es año
    public void checkMonthsBetwALtaToday()throws CustomException{
        
        System.out.println(toString());
        // al analista  se le aplica un plus mensual porcentual, pero de fomra anual
        // este metodo a diferencia del de porgramador tiene q averiguar si se ha cumplido para aplicar este bono.
        
        GregorianCalendar diaHoy = Fecha.diaHoy;
        int diaActual = diaHoy.get(DIA_DEL_MES);
        int mesActual = diaHoy.get(MES);
        int anioActual = diaHoy.get(ANIO);
        double aux = saldo;
        double increment = 0;
        boolean flagReachedMax = false;
        
        // si ha pasado almenos un año
        if(getNumMonthsSince()/12>=1){
            //recorremos cada año
            for(int i=0;i<getNumMonthsSince();i++){
                increment=(aux*porcentajeExtra/100);
                if(aux+increment > saldoMax){
                    flagReachedMax = true;
                    break;
                }
                aux+=increment;
            }
            if(aux <= saldoMax && !flagReachedMax){
                setSaldo(Math.round(aux));
                System.out.println("Cumple las condiciones, el nuevo saldo es: "+getSaldo()+"\n");
            }else{
               setSaldo(Math.round(aux));
                throw new CustomException("Error: superaria el saldo maximo ("+getSaldoMax()+") | Nuevo saldo sin llegar al limite: "+getSaldo()+"\n");
            }
        }else{
            System.out.println("No sobrepasa el año, fecha alta: "+getFechaAltaString()+"\n");
        }
    }
    
    public int getAniosEnAlta(){
        return 1;
    }

    public double getPorcetanjeExtra() {
        return porcentajeExtra;
    }

    public void setPorcetanjeExtra(double porcetanjeExtra) {
        this.porcentajeExtra = porcetanjeExtra;
    }

    public int getNumProyParticp() {
        return numProyParticp;
    }

    public void setNumProyParticp(int numProyParticp) {
        this.numProyParticp = numProyParticp;
    }

    @Override
    public String toString() {
        return empleadoToString()+" Analista{" + "porcetanjeExtra=" + porcentajeExtra + ", numProyParticp=" + numProyParticp + '}';
    }
    
    
}
