/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Reproductor;

/**
 *
 * @author astridmc
 */
public class Nota {
    notas nombre;
    int idNota;
    public enum notas{
        DO,
        RE,
        MI,
        FA,
        SOL,
        LA,
        SI
        
    }
    
    public static String ComprobarNota(String nota){
        if(notas.DO.toString().equals(nota)){
            return "C";
        }else if(notas.RE.toString().equals(nota)){
            return "D";
        }else if(notas.MI.toString().equals(nota)){
            return "E";
        }else if(notas.FA.toString().equals(nota)){
            return "F";
        }else if(notas.SOL.toString().equals(nota)){
            return "G";
        }else if(notas.LA.toString().equals(nota)){
            return "A";
        }else if(notas.SI.toString().equals(nota)){
            return "B";
        }else{
            return null;
        }
        
    }
}
