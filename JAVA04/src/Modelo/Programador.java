/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.GregorianCalendar;
import static java.util.Calendar.*;

/**
 *
 * @author alumno
 */
public class Programador extends Empleado{
    
    private double sueldoExtra;
    
    private String lengProgFav;
    
    // programador con fecha
    public Programador(int num, String name, String surName, double saldo, double saldoMax, GregorianCalendar gc,double sueldoExtra, String lengProgFav){
        super(num, name, surName, saldo, saldoMax,gc);
        this.sueldoExtra = sueldoExtra;
        this.lengProgFav = lengProgFav;
    }
    
    // programador sin fecha
    public Programador(int num, String name, String surName, double saldo, double saldoMax,double sueldoExtra, String lengProgFav){
        super(num, name, surName, saldo, saldoMax);
        this.sueldoExtra = sueldoExtra;
        this.lengProgFav = lengProgFav;
    }
    
    // programador de prueba
    public Programador(int num){
        super(num);
        this.sueldoExtra = 0;
        this.lengProgFav = null;
    }
    
    @Override
    public void checkCumpleMesAnio() throws CustomException{
        int diaActual = diaHoy.get(DIA_DEL_MES);
        if((getFechaAlta()).get(DAY_OF_MONTH) == diaActual){
            double aux = saldo+sueldoExtra; 
            if(aux <= saldoMax){
                setSaldo(aux);
                System.out.println("Cumple las condiciones, el nuevo saldo es: "+getSaldo()+"\n");
            }else
                throw new CustomException("Supera el saldo maximo\n");
        }else{
            //System.out.println("No cumple mes, fecha del empleado: "+getFechaAltaString()+"\n");
            throw new CustomException("No cumple mes\n");
        }
    }
    
    // para programador es mes
    // !!! creo que si se hace una segunda vez peta, hay que registrar hasta la fecha en la q se hizo el raise al sueldo
    public void checkMonthsBetwALtaToday()throws CustomException{
        
        System.out.println(toString());
        GregorianCalendar diaHoy = Fecha.diaHoy;
        int mesActual = diaHoy.get(MES);
        double aux = saldo;
        boolean flagReachedMax = false;
        // si al menos ha pasado un mes, aplicamos la suma correspondida
        if(getNumMonthsSince()>=1){
            //recorremos mes por mes
            for(int i=0;i<getNumMonthsSince();i++){
                aux+=sueldoExtra;
                if(aux > saldoMax){
                    aux-=sueldoExtra;
                    flagReachedMax = true;
                    break;
                }
            }
            if(aux <= saldoMax && !flagReachedMax){
                setSaldo(aux);
                System.out.println("Cumple las condiciones, el nuevo saldo es: "+getSaldo()+"\n");
            }else{
               setSaldo(aux);
                throw new CustomException("Error: superaria el saldo maximo ("+getSaldoMax()+") | Nuevo saldo sin llegar al limite: "+getSaldo()+"\n");
            }
        }else{
            System.out.println("No sobrepasa el mes, fecha alta: "+getFechaAltaString()+"\n");
        }
    }

    public double getSueldoExtra() {
        return sueldoExtra;
    }

    public void setSueldoExtra(double sueldoExtra) {
        this.sueldoExtra = sueldoExtra;
    }

    public String getLengProgFav() {
        return lengProgFav;
    }

    public void setLengProgFav(String lengProgFav) {
        this.lengProgFav = lengProgFav;
    }

    @Override
    public String toString() {
        return  empleadoToString()+" Programador{" + "sueldoExtra=" + sueldoExtra + ", lengProgFav=" + lengProgFav + '}';
    }
    
    
    
}
