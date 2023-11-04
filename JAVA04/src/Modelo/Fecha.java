/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author alumno
 */
public interface Fecha {
    
    //metodo que comprubea si el empleado esta en cumple mes o cumple año
    public void checkCumpleMesAnio()throws CustomException;
    
    public void checkMonthsBetwALtaToday() throws CustomException;

    GregorianCalendar diaHoy = new GregorianCalendar();
    
    public final int DIA_DEL_MES = GregorianCalendar.DAY_OF_MONTH;
    public final int MES = GregorianCalendar.MONTH;
    public final int ANIO = GregorianCalendar.YEAR;
}
